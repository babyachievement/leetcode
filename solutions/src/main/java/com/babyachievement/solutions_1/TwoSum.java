package com.babyachievement.solutions_1;

/**
 * https://leetcode.com/problems/two-sum/#/description
 *
 * @user Alvin
 * @create 2017-07-16 17:04
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {150,24,79,50,88,345,3};

        int[] ints = new TwoSum().twoSum(nums, 200);
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
        for(int i=0; i<nums.length; i++) {
            int left = target - nums[i];

            int result = binarySearch(nums, left, i + 1, nums.length - 1);
            if (result >= 0) {
                if(index[i]<index[result])
                return new int[]{index[i], index[result]};
                else return new int[]{index[result], index[i]};
            }
        }

        return null;
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

    public int binarySearch(int[] nums, int value, int start, int end) {
        int i = start, j = end;
        if (start <= end) {
            if (nums[i] == value) {
                return i;
            }

            if (nums[j] == value) {
                return j;
            }

            int middle = (start + end) / 2;
            if (nums[middle] == value) {
                return middle;
            }

            int left = binarySearch(nums, value, i + 1, middle - 1);
            int right = binarySearch(nums, value, middle + 1, end - 1);

            if (left >= 0) {
                return left;
            }

            if (right >= 0) {
                return right;
            }
        }

        return -1;
    }
}
