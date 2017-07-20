/**
 * FileName:ValidParentheses
 * Created by babyachievement
 * Date:17-7-19
 * Time:下午10:18
 */
package com.babyachievement.solutions_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static Map<Character, Character> parentMap = new HashMap<>(3);

    static {
        parentMap.put(')', '(');
        parentMap.put(']', '[');
        parentMap.put('}', '{');
    }

    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        if (chars.length % 2 != 0) {
            return false;
        }
        for (char aChar : chars) {
            if (aChar == '(' || aChar == '[' || aChar == '{') {
                stack.push(aChar);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            Character character = stack.pop();
            if (character.charValue() != parentMap.get(aChar)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println((int) '{');
        System.out.println((int) '}');
        System.out.println((int) '[');
        System.out.println((int) ']');
        System.out.println((int) '(');
        System.out.println((int) ')');
    }
}
