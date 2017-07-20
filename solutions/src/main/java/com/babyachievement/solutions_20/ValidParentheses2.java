/**
 * FileName:ValidParentheses
 * Created by babyachievement
 * Date:17-7-19
 * Time:下午10:18
 */
package com.babyachievement.solutions_20;

public class ValidParentheses2 {

    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }

        char[] chars = s.toCharArray();
        char[] stack = new char[s.length()];
        int top = 0;

        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack[top++] = c;
            }

            if (top != 0) {
                if (c == ')' && stack[--top] != '(') {
                    return false;
                }

                if (c == ']' && stack[--top] != '[') {
                    return false;
                }

                if (c == '}' && stack[--top] != '{') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return top == 0;
    }
}
