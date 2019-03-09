/**
 * date: 2019/3/4 11:01
 */

package com.babyachievement;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-watch/
 */
public class BinaryWatch401 {
    int[] hours   = {8, 4, 2, 1};
    int[] minutes = {32, 16, 8, 4, 2, 1};

    public List<String> readBinaryWatch(int num) {

        List<String> result = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            List<Integer> hours   = new ArrayList<>();
            List<Integer> minutes = new ArrayList<>();

            readHours(0, i, 0, hours);
            readMinutes(0, num - i, 0, minutes);

            for (Integer hour : hours) {
                for (Integer minute : minutes) {
                    System.out.printf("");
                    result.add(MessageFormat.format("{0}:{1}{2}",
                                                    hour,
                                                    minute < 10 ? "0" : "",
                                                    minute));
                }
            }
        }


        return result;
    }

    private void readHours(int index, int num, int value,
                           List<Integer> result) {
        if (num < 0 || value > 11) {
            return;
        }
        if (num == 0) {
            result.add(value);
            return;
        }

        for (int i = index; i < 4; i++) {
            readHours(i + 1, num - 1, value + hours[i], result);
        }

    }

    private void readMinutes(int index, int num, int value,
                             List<Integer> result) {
        if (value > 59 || num < 0) {
            return;
        }

        if (num == 0) {
            result.add(value);
            return;
        }

        for (int i = index; i < 6; i++) {
            readMinutes(i + 1, num - 1, value + minutes[i], result);
        }
    }
}
