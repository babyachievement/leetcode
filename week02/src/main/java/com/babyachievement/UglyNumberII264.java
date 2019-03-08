package com.babyachievement;

/**
 * https://leetcode.com/problems/ugly-number-ii/description/
 */
public class UglyNumberII264 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[1690];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 3;
        dp[3] = 4;
        dp[4] = 5;

        int[] nextIndex = new int[3];
        nextIndex[0] = 2;
        nextIndex[1] = 2;
        nextIndex[2] = 4;

        int count = 5;
        int min = 5;
        while (count < n) {
            int i1 = dp[nextIndex[0]] * 2;
            int i2 = dp[nextIndex[1]] * 3;
            int i3 = dp[nextIndex[2]] * 5;
            if(i1 <= i2 && i1 <= i3) nextIndex[0]++;
            if(i2 <= i1 && i2 <= i3) nextIndex[1]++;
            if(i3 <= i1 && i3 <= i2) nextIndex[2]++;
            dp[count++] = Math.min(Math.min(i1, i2), i3);
        }


        return dp[n - 1];
    }

    public int nthUglyNumber2(int n) {
        int[] dp=new int[n];dp[0]=1;
        return DFS(dp,1,0,0,0,n);
    }

    private int DFS(int[] dp, int i, int p2, int p3, int p5, int n) {
        if (i==n)return dp[n-1];
        dp[i]=Math.min(dp[p2]*2, Math.min(dp[p3]*3,dp[p5]*5));
        if (dp[i]==dp[p2]*2)p2++;
        if(dp[i]==dp[p3]*3)p3++;
        if (dp[i]==dp[p5]*5)p5++;
        return DFS(dp, i+1, p2, p3, p5, n);
    }
}
