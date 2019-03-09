/**
 * date: 2019/3/6 18:17
 */

package com.babyachievement;

import java.util.LinkedList;
import java.util.List;

public class SplitArrayIntoFibonacciSequence842 {
    public List<Integer> splitIntoFibonacci(String S) {
        LinkedList<Integer> result = new LinkedList<>();

        split(result, S, -1, 0);

        return result;
    }

    private boolean split(LinkedList<Integer> result, String S, int f1,
                          int index) {
        final int length = S.length();
        if (index >= length && result.size() >= 3) {
            return true;
        }


        for (int i = index; i < length; i++) {
            if (i > index && S.charAt(index) == '0') {
                return false;
            }
            System.out.println("index: "+index+" i: " + i);
            if(Long.parseLong(S.substring(index, i + 1))>Integer.MAX_VALUE) {
                return false;
            }
            final int f3 = Integer.parseInt(S.substring(index, i + 1));


            if (result.isEmpty()) {
                result.addLast(f3);
//                System.out.println("Add :" + f3+ " f1=" +f1);

                if (split(result, S, f1, i + 1)) {
                    return true;
                } else {
//                    System.out.println("Remove :" + f3);
                    result.removeLast();
                }
            } else {
                if (f1 == -1) {
                    final Integer f11 = result.peekLast();
//                    System.out.println("Add :" + f3 + " f1=" +f1);
                    result.addLast(f3);
                    if (split(result, S, f11, i + 1)) {
                        return true;
                    } else {
                        result.removeLast();
//                        System.out.println("Remove :" + f3);
                    }
                } else {
                    if (f3 > f1 + result.peekLast()) {
                        break;
                    } else if(f1 + result.peekLast()==f3){
                        final Integer f11 = result.peekLast();
                        result.addLast(f3);
//                        System.out.println("Add :" + f3+ " f1=" +f1);
                        if (split(result, S, f11, i + 1)) {
                            return true;
                        }else {
                            result.removeLast();
//                            System.out.println("Remove :" + f3);
                        }
                    }
                }
            }
        }


        return false;
    }
}
