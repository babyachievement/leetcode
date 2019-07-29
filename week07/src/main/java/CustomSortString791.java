/**
 * date: 2019/7/29 14:28
 */

public class CustomSortString791 {
    public String customSortString(String S, String T) {
        final char[] chars = S.toCharArray();

        final StringBuilder stringBuilder = new StringBuilder();

        int[] count = new int[26];
        for (int i = 0; i < T.length(); i++) {
            count[T.charAt(i) - 'a']++;
        }


        for (int j = 0; j < chars.length; j++) {
            if (count[S.charAt(j) - 'a'] > 0) {
                for (int i = 0; i < count[S.charAt(j) - 'a']; i++) {
                    stringBuilder.append(S.charAt(j));
                }
            }
            count[S.charAt(j) - 'a'] = 0;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    stringBuilder.append((char)('a' + i));
                }
            }
        }

        return stringBuilder.toString();
    }
}
