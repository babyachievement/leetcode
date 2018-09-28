/**
 * date: 2018/9/27 16:02
 */

package com.babyachievement.top100;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/decode-string/description/
 */
public class DecodeString394 {

    int index = 0;

    public String decodeString(String s) {
        final StringBuilder stringBuilder = new StringBuilder();

        LinkedList<StringBuilder> stringBuilders = new LinkedList<>();
        stringBuilders.add(stringBuilder);
        LinkedList<Integer> repeats = new LinkedList<>();
        repeats.add(1);

        final char[] chars = s.toCharArray();
        while (index < chars.length) {
            final int i = readNumber(chars);
            if (i > 0) {
                repeats.add(Integer.parseInt(String.valueOf(chars,
                                                            index - i,
                                                            i)));
            } else if (chars[index] == '[') {
                final StringBuilder builder = new StringBuilder();
                stringBuilders.add(builder);
                index++;
            } else if (chars[index] == ']') {
                final String  last    = stringBuilders.pollLast().toString();
                final Integer integer = repeats.pollLast();
                for (int j = 0; j < integer.intValue(); j++) {
                    stringBuilders.peekLast().append(last);
                }
                index++;
            } else {
                stringBuilders.peekLast().append(chars[index]);
                index++;
            }
        }


        return stringBuilder.toString();
    }


    /**
     * 返回第一个非数字位置索引
     *
     * @param chars
     * @return
     */
    private int readNumber(char[] chars) {
        int i = 0;
        for (; index < chars.length; index++, i++) {
            if (!Character.isDigit(chars[index])) {
                break;
            }
        }

        return i;
    }


    public String decodeString2(String s) {
        char[] str = s.toCharArray();
        return decodeHelper(str, 0, str.length - 1);
    }

    public String decodeHelper(char[] str, int start, int end) {
        //System.out.println(start + "  " + end);
        StringBuilder re          = new StringBuilder();
        int           number      = 0;
        int           m           = 0;
        int           n           = 0;
        int           stackNumber = 0;
        boolean       hasFound    = false;
        for (int i = start; i <= end; i++) {
            char c = str[i];
            if (!hasFound) {
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                    re.append(c);
                else if (c >= '0' && c <= '9')
                    number = number * 10 + c - '0';
                else if (c == '[') {
                    hasFound = true;
                    m = i + 1;
                    stackNumber++;
                }
            } else {
                if (c == '[') {
                    stackNumber++;
                } else if (c == ']') {
                    stackNumber--;
                    if (stackNumber == 0) {
                        n = i - 1;
                        hasFound = false;
                        String temp = decodeHelper(str, m, n);
                        while (number > 0) {
                            re.append(temp);
                            number--;
                        }
                    }
                }
            }

        }
        return re.toString();
    }

}
