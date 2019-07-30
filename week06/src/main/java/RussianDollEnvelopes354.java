import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RussianDollEnvelopes354 {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0) {
            return 0;
        }


        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                }

                return o1[0] - o2[0];
            }
        });

        int[] height = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            height[i] = envelopes[i][1];
        }

        return lengthOfLIS2(height);
    }

    public int lengthOfLIS2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int[] subSequ = new int[len];
        Arrays.fill(subSequ, Integer.MAX_VALUE);
        subSequ[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int index = getIndex(subSequ,  nums[i], i);
            subSequ[index] = nums[i];
        }
        for (int i = len - 1; i >=0; i--) {
            if(subSequ[i] != Integer.MAX_VALUE) {
                return i + 1;
            }
        }
        return 0;
    }

    private int getIndex(int[] nums, int target, int i) {
        int left = 0;
        int right = i;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return nums[left] >= target ? left : right;
    }

    public static void main(String[] args) {
        RussianDollEnvelopes354 russianDollEnvelopes354 = new RussianDollEnvelopes354();
        System.out.println(russianDollEnvelopes354.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
        System.out.println(russianDollEnvelopes354.maxEnvelopes(new int[][]{{4,5},{4,6},{6,7},{2,3},{1,1}}));
    }
}
