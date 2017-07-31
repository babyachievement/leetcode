/**
 * FileName:MyPower
 * Created by HaoQiang
 * Date:17-7-31
 * Time:下午11:31
 */
package com.babyachievement.solutions_50;

public class MyPower {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x < -0.9999999 && x > -1.0000001) {
            if (n % 2 == 0)
                return 1.0;
            else {
                return -1.0;
            }
        }

        if (x > 0.9999999 && x - 1.0 < 0.0000001) {
            return 1.0;
        }
        double result = 1.0;

        while (n > 0) {
            result *= x;

            if (result > 0 && result < 0.000000001) {
                return 0.0;
            }
            n--;
        }

        while (n < 0) {
            result /= x;
            if (result > 0 && result < 0.000000001) {
                return 0.0;
            }
            n++;
        }

        return result;
    }
}
