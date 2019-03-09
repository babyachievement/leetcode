/**
 * date: 2019/3/8 10:52
 */

package com.babyachievement;

public class StringWithoutAAAOrBBB984 {
    public String strWithout3a3b(int A, int B) {

        final StringBuilder stringBuilder = new StringBuilder();
        if (A > B) {
            strWithout(A, B, 'a', 'b', stringBuilder);
        }else {
            strWithout(B, A, 'b', 'a', stringBuilder);
        }

        return stringBuilder.toString();
    }

    public void strWithout(int big, int small, char ch1, char ch2,
                           StringBuilder stringBuilder) {

        int i = big, j = small;
        while (i > 0) {
            i--;
            stringBuilder.append(ch1);

            if (i > j) {
                stringBuilder.append(ch1);
                i--;
            }

            if (j > 0) {
                stringBuilder.append(ch2);
                j--;
            }
        }
    }
}
