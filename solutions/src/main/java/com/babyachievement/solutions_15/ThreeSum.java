/**
 * FileName:ThreeSum
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午9:12
 */
package com.babyachievement.solutions_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> integers = new ArrayList<>();
        for (int num : nums) {
            integers.add(num);
        }
        Collections.sort(integers);

        for (int i = 0; i < length - 2; i++) {
            int sum = 0 - integers.get(i);
            int start = i + 1;
            while (start < length - 1) {
                int index = search(integers, start + 1, length - 1, sum - integers.get(start));
                if (index != -1) {
                    List<Integer> integerList = new ArrayList<>();
                    integerList.add(integers.get(i));
                    integerList.add(integers.get(start));
                    integerList.add(integers.get(index));

                    if (!contains(result, integerList)) {
                        result.add(integerList);
                    }
                }
                start++;
            }
        }

        return result;
    }

    public int search(List<Integer> integers, int start, int end, int value) {
        if (start < 0 || start > end) {
            return -1;
        }
        if (integers.get(start) == value) {
            return start;
        }

        if (integers.get(end) == value) {
            return end;
        }

        int mid = (start + end) / 2;

        if (integers.get(mid) == value) {
            return mid;
        }

        if (integers.get(mid) > value) {
            return search(integers, start, mid - 1, value);
        } else {
            return search(integers, mid + 1, end, value);
        }
    }

    public boolean contains(List<List<Integer>> result, List<Integer> integers) {
        int size = result.size();
        if (size > 0) {
            boolean contains = false;
            for (int i = size - 1; i > -1; i--) {
                List<Integer> integers1 = result.get(i);

                if (integers1.get(0).intValue() == integers.get(0).intValue()) {
                    if (integers1.get(1).intValue() == integers.get(1).intValue()) {
                        contains = true;
                        break;
                    }
                }else {
                    break;
                }
            }
            return contains;
        }
        return false;
    }
}
