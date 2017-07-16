package com.babyachievement.solutions_1;

/**
 * https://leetcode.com/problems/two-sum/#/description
 *
 * @user Alvin
 * @create 2017-07-16 17:04
 */

public class TwoSum3 {
    public static void main(String[] args) {
        int[] nums = {150, 24, 79, 50, 88, 345, 3};

        int[] ints = new TwoSum3().twoSum(nums, 200);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            index[i] = i;
        }

        quickSort(nums, index, 0, nums.length - 1);
        int l = 0;
        int r = nums.length - 1;
        while ((nums[l] + nums[r]) != target) {
            if ((nums[l] + nums[r]) > target) {
                r--;
            } else {
                l++;
            }
        }

        if(index[l]<index[r])
            return new int[]{index[l], index[r]};
        else
            return new int[]{index[r], index[l]};
    }

    public void quickSort(int[] nums, int[] index, int start, int end) {
        int i = start, j = end;
        int temp;
        int indexTemp;
        if (start < end) {
            temp = nums[start];
            indexTemp = index[start];
            while (i != j) {
                while (j > i && nums[j] >= temp) {
                    j--;
                }

                nums[i] = nums[j];
                index[i] = index[j];
                while (i < j && nums[i] <= temp) {
                    i++;
                }
                nums[j] = nums[i];
                index[j] = index[i];
            }

            nums[i] = temp;
            index[i] = indexTemp;
            quickSort(nums, index, start, i - 1);
            quickSort(nums, index, i + 1, end);
        }
    }

}
