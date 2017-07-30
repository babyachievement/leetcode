/**
 * FileName:CountAndSay
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午11:27
 */
package com.babyachievement.solutions_38;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }


        String t = countAndSay(n - 1);

        StringBuilder stringBuilder = new StringBuilder();
        int length = t.length();
        int i = 0;
        int count = 1;
        char last = t.charAt(0);
        i++;
        while (i < length) {
            if (last != t.charAt(i)) {
                stringBuilder.append(count).append(last);
                last = t.charAt(i);
                count = 1;
            } else {
                count++;
            }

            i++;
        }

        stringBuilder.append(count).append(last);
        return stringBuilder.toString();

    }
}
