import java.util.Arrays;

/**
 * date: 2019/7/18 9:47
 */

public class DeleteAndEarn740 {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int[] maxTake   = new int[nums.length];
        int[] maxUnTake = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                maxTake[0] = nums[0];
            } else if(nums[i] == nums[i-1]) {
                maxTake[i] = maxTake[i - 1] + nums[i];
                maxUnTake[i] = maxUnTake[i - 1];
            }else {
                if (nums[i] == nums[i - 1] + 1) {
                    maxTake[i] = maxUnTake[i - 1] + nums[i];
                    maxUnTake[i] = Math.max(maxUnTake[i - 1], maxTake[i - 1]);
                }else {
                    maxTake[i] = Math.max(maxUnTake[i - 1], maxTake[i - 1]) + nums[i];
                    maxUnTake[i] = Math.max(maxUnTake[i - 1], maxTake[i - 1]);
                }
            }

        }

        return Math.max(maxUnTake[nums.length-1], maxTake[nums.length-1]);
    }


    public static void main(String[] args) {
        final DeleteAndEarn740 deleteAndEarn740 = new DeleteAndEarn740();
        System.out.println(deleteAndEarn740.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
        System.out.println(deleteAndEarn740.deleteAndEarn(new int[]{3, 4, 2}));
        System.out.println(deleteAndEarn740.deleteAndEarn(new int[]{1, 6, 3, 3, 8, 4, 8, 10, 1, 3}));
    }
}
