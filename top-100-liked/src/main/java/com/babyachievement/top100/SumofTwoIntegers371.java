/**
 * date: 2018/10/31 18:01
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/sum-of-two-integers/description/
 */
public class SumofTwoIntegers371 {
    public int getSum(int a, int b) {
        int sum = a;

        /*直到进位的结果为0*/
        while (b != 0) {
            sum = a ^ b; /*不考虑进位的和*/
            System.out.println("sum= " + sum);
            b = (a & b) << 1; /*只考虑进位的产生值*/
            System.out.println("b= " + sum);
            a = sum;
            System.out.println("a= " + a);
        }//while

        return sum;
    }
}
