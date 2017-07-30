/**
 * FileName:LongestSubstringLength
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午5:56
 */
package com.babyachievement.solutions_3;

public class LongestSubstringLength {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int length = s.length();

        if (length == 1) {
            return 1;
        }

        int lastLongestLength = 0;

        int currentStartIndex = 0;
        int maxLength = 1;
        for (int i = 1; i < length; i++) {
            String substring = s.substring(currentStartIndex, i);
            int occurIndex = substring.indexOf(s.charAt(i));
            if (occurIndex != -1) {
                if (maxLength > lastLongestLength) {
                    lastLongestLength = maxLength;
                }

                currentStartIndex = currentStartIndex + occurIndex + 1; // next start index
                maxLength = maxLength - occurIndex;
            } else {
                maxLength += 1;
            }
        }
        return Math.max(lastLongestLength, maxLength);
    }
}
