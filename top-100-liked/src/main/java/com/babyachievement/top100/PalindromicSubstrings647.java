/**
 * date: 2018/10/8 15:49
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/palindromic-substrings/description/
 */
public class PalindromicSubstrings647 {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        final char[] chars = s.toCharArray();
        int          count = 0;
        for (int start = 0; start < s.length(); start++) {
            int maxLen = s.length() - start;
            for (int len = 1; len <= maxLen; len++) {
                if (isPalindromic(chars, start, start + len - 1)) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean isPalindromic(char[] str, int i, int j) {
        if (str == null) {
            return false;
        }

        if (str.length == 0) {
            return true;
        }

        while (i <= j) {
            if (str[i] != str[j]) {
                return false;
            }

            j--;
            i++;
        }

        return true;
    }

    public int countSubstringsDP(String s) {
        final char[] chars = s.toCharArray();

        boolean[][] dp = new boolean[s.length()][s.length()];

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }

        for (int len = 1; len <= s.length(); len++) {
            for (int start = 0; start <= s.length() - len; start++) {
                if (chars[start] == chars[start + len - 1]) {
                    if (len > 2) {
                        if (dp[start + 1][start + len - 2]) {
                            dp[start][start + len - 1] = true;
                            count++;
                        }
                    } else {
                        dp[start][start + len - 1] = true;
                        count++;
                    }
                }
            }
        }


        return count;
    }

    /**
     * Manacher's alogrithm
     *
     * @param S
     * @return
     */
    public int countSubstrings3(String S) {
        char[] A = new char[2 * S.length() + 3];
        A[0] = '@';
        A[1] = '#';
        A[A.length - 1] = '$';
        int t = 2;
        for (char c : S.toCharArray()) {
            A[t++] = c;
            A[t++] = '#';
        }

        int[] Z      = new int[A.length];
        int   center = 0, right = 0;
        for (int i = 1; i < Z.length - 1; ++i) {
            if (i < right)
                Z[i] = Math.min(right - i, Z[2 * center - i]);
            while (A[i + Z[i] + 1] == A[i - Z[i] - 1])
                Z[i]++;
            if (i + Z[i] > right) {
                center = i;
                right = i + Z[i];
            }
        }
        int ans = 0;
        for (int v : Z) ans += (v + 1) / 2;
        return ans;
    }

    public int countSubstrings4(String s) {
        char[] s2  = s.toCharArray();
        int    res = 0;

        for (int i = 0; i < s2.length; ) {
            int j = i - 1, k = i + 1;
            while (k < s2.length && s2[k] == s2[k - 1]) {
                k++;
            }
            res += (1 + k - i) * (k - i) / 2;
            i = k;
            while (j >= 0 && k < s2.length && s2[j--] == s2[k++]) {
                res++;
            }

        }
        return res;
    }

}
