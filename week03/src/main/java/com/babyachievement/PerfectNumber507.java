/**
 * date: 2019/3/6 16:46
 */

package com.babyachievement;

public class PerfectNumber507 {
    public boolean checkPerfectNumber(int num) {

        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }

            }
        }
        return sum - num == num;
    }

    public static void main(String[] args) {
        System.out.println(new PerfectNumber507().checkPerfectNumber(28));
        System.out.println(new PerfectNumber507().checkPerfectNumber(1));
    }
}
