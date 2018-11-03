/**
 * date: 2018/11/2 14:39
 */

package com.babyachievement.top100;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/basic-calculator-ii/description/
 */
public class BasicCalculatorII227 {
    public int calculate(String s) {
        LinkedList<Character> operators = new LinkedList<>();
        LinkedList<Integer> operands = new LinkedList<>();

        boolean num = false;
        int numStartIndex = 0;
        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                if (!num) {
                    numStartIndex = i;
                    num = true;
                }
                i++;
            } else {
                if (num) {
                    operands.add(Integer.parseInt(s.substring(numStartIndex, i)));
                    num = false;
                }

                if (' ' == s.charAt(i)) {
                    i++;
                    continue;
                } else {
                    switch (s.charAt(i)) {
                        case '/':
                            int[] index = new int[1];
                            index[0] = i + 1;
                            int num1 = readNumber(s, index);
                            int num2 = operands.pollLast();
                            i = index[0];
                            operands.add(num2 / num1);
                            break;
                        case '*':
                            int[] index2 = new int[1];
                            index2[0] = i + 1;
                            int num4 = readNumber(s, index2);
                            i = index2[0];
                            int num3 = operands.pollLast();
                            operands.add(num3 * num4);
                            break;
                        default:
                            operators.add(s.charAt(i));
                            i++;
                    }
                }
            }
        }

        if (num) {
            operands.add(Integer.parseInt(s.substring(numStartIndex, i)));
        }

        while (!operators.isEmpty()) {
            int num1 = operands.pollFirst();
            int num2 = operands.pollFirst();
            switch (operators.pollFirst()) {
                case '+':
                    operands.addFirst(num1 + num2);
                    break;
                case '-':
                    operands.addFirst(num1 - num2);
                    break;
            }
        }


        return operands.peekLast().intValue();
    }

    int readNumber(String s, int[] i) {

        boolean start = false;
        int numStartIndex = i[0];
        for (int j = i[0]; j < s.length(); j++) {
            if (Character.isDigit(s.charAt(j))) {
                if (!start) {
                    start = true;
                    numStartIndex = j;
                }
            } else {
                if(start) {
                    i[0] = j;
                    return Integer.parseInt(s.substring(numStartIndex, j));
                }else {
                    continue;
                }
            }
        }

        if (start) {
            i[0] = s.length();
            return Integer.parseInt(s.substring(numStartIndex, s.length()));
        }


        return 0;
    }
}
