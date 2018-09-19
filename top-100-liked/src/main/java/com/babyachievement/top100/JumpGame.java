package com.babyachievement.top100;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int current = 0;
        int maxReach = -1;
        while (current >= len - 1) {
            if (current + nums[current] > maxReach) {
                maxReach = current + nums[current];
            }

            for(int i=0; i<nums[current]; i++) {
                if (current + i +1 + nums[current + i +1 ] > maxReach) {
                    maxReach = current + i +1 + nums[current + i +1 ];
                }
            }
        }
        return false;
    }


}
