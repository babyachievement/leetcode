/**
 * date: 2018/11/1 15:46
 */

package com.babyachievement.top.interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/4sum-ii/description/
 */
public class Four4SumII454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<C.length; i++) {
            for(int j=0; j<D.length; j++) {
                int sum = C[i] + D[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int res=0;
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<B.length; j++) {
                res += map.getOrDefault(-1 * (A[i]+B[j]), 0);
            }
        }

        return res;
    }


    // Time limit exceeded
    public int bruteForceFourSumCount(int[] A, int[] B, int[] C, int[] D) {
        final int length = A.length;

        int count = 0;
        if (length == 0) {
            return count;
        }

        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);


        List<HashMap<Integer, Integer>> countMapList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            countMapList.add(new HashMap<>());
        }
        for (int i = 0; i < length; i++) {
            Integer keyCount = countMapList.get(0).get(0-A[i]);
            if (null != keyCount) {
                count += keyCount.intValue();
                continue;
            }

            int preA = count;

            for (int j = 0; j < length; j++) {
                keyCount = countMapList.get(1).get(0 - A[i]- B[j]);
                if (null != keyCount) {
                    count += keyCount.intValue();
                    continue;
                }

                int preB = count;
                for (int k = 0; k < length; k++) {
                    keyCount = countMapList.get(2).get(0 - A[i]- B[j] -C[k]);
                    if (null != keyCount) {
                        count += keyCount.intValue();
                        continue;
                    }

                    int preC = count;

                    int l = Arrays.binarySearch(D, 0,
                                                length, 0 - A[i] - B[j] - C[k]);
                    if (l >= 0) {
                        count++;
                        for (int m = l; m < length - 1; m++) {
                            if (D[m] != D[m + 1]) {
                                break;
                            }
                            count++;
                        }

                        for (int m = l; m > 0; m--) {
                            if (D[m] != D[m - 1]) {
                                break;
                            }
                            count++;
                        }
                    }
                    countMapList.get(2).put(0 - A[i]- B[j] - C[k], count -
                            preC);
                }
                countMapList.get(1).put(0 - A[i]- B[j], count - preB);
            }
            countMapList.get(0).put(0 - A[i], count - preA);
        }

        return count;
    }
}
