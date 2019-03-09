/**
 * date: 2019/3/4 15:01
 */

package com.babyachievement;

public class ConvertANumberToHexadecimal405 {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] map    = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String result = "";
        int    i      = num;
        while (i != 0) {
            result = map[i & 15] + result;
            i = i >>> 4;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ConvertANumberToHexadecimal405().toHex(-1));
        System.out.println(new ConvertANumberToHexadecimal405().toHex(0));
    }
}
