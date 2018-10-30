/**
 * date: 2018/10/18 14:55
 */

package com.babyachievement.top.interviews;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/fraction-to-recurring-decimal/description/
 */
public class FractionToRecurringDecimal166 {
    public String fractionToDecimal(int numerator, int denominator) {
        long num1 = numerator;
        long num2 = denominator;
        final long i1 = num1 / num2;

        final StringBuilder stringBuilder = new StringBuilder();

        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            if (Math.abs(num1) < Math.abs(num2)) {
                stringBuilder.append("-");
            }
        }

        stringBuilder.append(i1);

        Map<Long, Long> map = new HashMap<>();
        if (num1 % num2 != 0) {
            stringBuilder.append(".");
            calPoint(Math.abs(num1 % num2), Math.abs(num2),
                     stringBuilder,
                     map);
        }


        return stringBuilder.toString();
    }

    private void calPoint(long numerator, long denominator, StringBuilder
            stringBuilder, Map<Long, Long> map) {
        System.out.println(numerator);
        if (map.containsKey(numerator)) {
            stringBuilder.insert(map.get(numerator).intValue(), "(");
            stringBuilder.append(")");
            return;
        }


        if (numerator % denominator == 0) {
            stringBuilder.append(numerator / denominator);
            return;
        } else {
            if (numerator > denominator) {
                stringBuilder.append(numerator / denominator);
                map.put(numerator, stringBuilder.length() - 1L);
                calPoint(numerator % denominator,
                         denominator,
                         stringBuilder, map);
            } else {
                if (numerator < denominator) {
                    map.put(numerator, stringBuilder.length() +0L);
                }
                numerator = numerator * 10;
                while (numerator < denominator) {
                    map.put(numerator, stringBuilder.length()+1L);
                    numerator *= 10;
                    stringBuilder.append("0");
                }

                calPoint(numerator, denominator, stringBuilder, map);
            }
        }
    }

    public String fractionToDecimal2(int numerator, int denominator) {
        if (denominator==0||numerator==0)return "0";
        StringBuilder sb=new StringBuilder();
        if((numerator<0)^(denominator<0))
            sb.append("-");
        long a=Math.abs((long)numerator);
        long b=Math.abs((long)denominator);
        sb.append(a/b);
        a=a%b;
        if(a==0)
            return sb.toString();
        sb.append(".");
        HashMap<Long,Integer>hm=new HashMap<>();
        hm.put(a,sb.length());
        while(a!=0){
            a=a*10;
            sb.append(a/b);

            a=a%b;
            if(hm.containsKey(a)){
                sb.insert(hm.get(a),"(");
                sb.append(")");
                return sb.toString();
            }
            hm.put(a,sb.length());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(-7 / 12);
    }
}
