/**
 * date: 2018/10/26 17:41
 */

package com.babyachievement.top.interviews;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
 */
public class EvaluateReversePolishNotation150 {

    public int evalRPN(String[] tokens) {
        LinkedList<Integer> stack = new LinkedList();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.addLast(calculate(stack, "+"));
                    break;
                case "-":
                    stack.addLast(calculate(stack, "-"));
                    break;
                case "*":
                    stack.addLast(calculate(stack, "*"));
                    break;
                case "/":
                    stack.addLast(calculate(stack, "/"));
                    break;
                default:
                    stack.addLast(Integer.valueOf(token));
            }
        }

        return Integer.valueOf(stack.peekLast());
    }

    int calculate(LinkedList<Integer> stack, String operator) {
        int op2 = stack.pollLast().intValue();
        int op1 = stack.pollLast().intValue();
        switch (operator) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            default:
                return 0;
        }
    }
}
