/**
 * date: 2019/7/17 15:53
 */

public class LongestUncommonSubsequenceI521 {
    public int findLUSlength(String[] strs) {
        int                  max = -1;
        for (int i = 0; i < strs.length; i++) {
            int j = 0;
            for (; j < strs.length; j++) {
                if (i == j) {
                    continue;
                }
                if (isSubsequence(strs[i], strs[j])) {
                    break;
                }
            }

            if (j == strs.length)
                max = Math.max(max, strs[i].length());
        }


        return max;
    }

    boolean isSubsequence(String a, String b) {
        int j = 0;
        int i = 0;
        while (j < b.length() && i < a.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i >= a.length();
    }

    public static boolean isEmpty(final String string) {
        return string == null || string.length() == 0;
    }

    public static String join(final char delimiter, final String... strings) {
        if (strings.length == 0) {
            return null;
        }
        if (strings.length == 1) {
            return strings[0];
        }
        int length = strings.length - 1;
        for (final String s : strings) {
            if (!isEmpty(s)) {
                length += s.length();
            }
        }
        final StringBuilder sb = new StringBuilder(length);
        sb.append(strings[0]);
        for (int i = 1; i < strings.length; ++i) {
            if (!isEmpty(strings[i])) {
                sb.append(delimiter).append(strings[i]);
            }
        }
        return sb.toString();
    }

    public static String getJointedNameParts(final String... parts) {
        String    jointedParts = "";
        final int nameLimit    = 3;

        if (parts != null) {
            String[] tempParts = parts;
            if (parts.length == 1 && !parts[0].equals("/")) {
                tempParts = parts[0].split("/");
            }

            if (tempParts.length > nameLimit) {
                StringBuilder name  = new StringBuilder();
                int           start = 0;
                if (isEmpty(tempParts[0])) {
                    start = 1;
                }

                for (int i = 0; i < nameLimit - 1; i++) {
                    name.append(tempParts[i + start]);
                    name.append('/');
                }
                name.append(tempParts[nameLimit - 1 + start]);
                jointedParts = name.toString();
            } else {
                jointedParts = LongestUncommonSubsequenceI521.join('/',
                                                                   tempParts);
            }
            if (jointedParts != null && !jointedParts.startsWith("/")) {
                jointedParts = "/" + jointedParts;
            }
        }
        return jointedParts;
    }

    public static void main(String[] args) {
        final LongestUncommonSubsequenceI521 longestUncommonSubsequenceI521 = new LongestUncommonSubsequenceI521();
        System.out.println(longestUncommonSubsequenceI521.findLUSlength(new String[]{"aabbcc",
                "aabbcc", "cb", "abc"}));
//
//        System.out.println("/2".split("/").length);
//        System.out.println(LongestUncommonSubsequenceI521.getJointedNameParts("/"));
//        System.out.println(LongestUncommonSubsequenceI521.getJointedNameParts(" /"));
//        System.out.println(LongestUncommonSubsequenceI521.getJointedNameParts(" /".split("/")));
//        System.out.println(LongestUncommonSubsequenceI521.getJointedNameParts("/".split("/")));
//        System.out.println(LongestUncommonSubsequenceI521.getJointedNameParts("/name/name"));

    }
}
