package com.babyachievement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutation-sequence/description/
 */
public class PermutationSequence60 {
    public String getPermutation(int n, int k) {

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(i + 1);
        }
        int[] result = new int[1];
        bruteForceGetPermutation(n, k, 0, 0, result, num);
        return String.valueOf(result[0]);
    }


    public int bruteForceGetPermutation(int n, int k, int index, int count, int[] result, List<Integer> num) {
        if (count + 1 == k) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum * 10 + num.get(i).intValue();
            }
            result[0] = sum;
        }

        if (index == n) {
            return count + 1;
        }


        Integer v = num.get(index);

        for (int i = index; i < n; i++) {
            Integer tepm = num.remove(i);
            num.add(index, tepm);
            System.out.println(num + " -> " + count);
            count = bruteForceGetPermutation(n, k, index + 1, count, result, new ArrayList<>(num));

            if (count >= k) {
                break;
            }

            num.remove(index);
            num.add(i, tepm);
        }


        return count;
    }


    public String getPermutation2(int n, int k) {
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = i * fact[i - 1];
        }

        for (int i = 0; i < n + 1; i++) {
            System.out.println(fact[i]);
        }

        int[] res = new int[n];
        int perms = 0;
        boolean[] used = new boolean[n + 1];

        for (int ind = 0; ind < n; ind++) {
            for (int i = 1; i <= n; i++) {
                if (used[i]) continue;

                if (perms + fact[n - 1 - ind] < k) {
                    perms += fact[n - 1 - ind];
                } else {
                    used[i] = true;
                    res[ind] = i;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int x : res) sb.append(x);
        return sb.toString();
    }

    public String getPermutation3(int n, int k) {

        /*

            1. generate the number array [1...n]
            2. iterativly using k/(i - 1)! to find the index of number we want, and append the number to sb.
            until i == 1
        */

        List<Integer> nums = new LinkedList<>();
        int[] fact = new int[n];
        fact[0] = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            nums.add(i + 1);
            if (i != 0)
                fact[i] = fact[i - 1] * i;
        }

        k--;

        for (int i = n; i >= 1; i--) {
            int index = k / fact[i - 1];
            sb.append(nums.get(index));
            k %= fact[i - 1];
            nums.remove(index);

        }

        return sb.toString();
    }

}
