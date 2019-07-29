import java.util.Arrays;

/**
 * date: 2019/7/29 16:20
 */

public class FindAndReplaceInString833 {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        final StringBuilder stringBuilder = new StringBuilder();

        int[] match = new int[S.length()];
        Arrays.fill(match, -1);

        for (int i = 0; i < indexes.length; i++) {
            final String substring = S.substring(indexes[i],
                                                 indexes[i] + sources[i].length());
            if (substring.equals(sources[i])) {
                match[indexes[i]] = i;
            }
        }


        int i = 0;
        while (i < S.length()) {
            if (match[i] != -1) {
                stringBuilder.append(targets[match[i]]);
                i += sources[match[i]].length();
            } else {
                stringBuilder.append(S.charAt(i++));
            }
        }


        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        final FindAndReplaceInString833 findAndReplaceInString833 = new FindAndReplaceInString833();
        final String abcd = findAndReplaceInString833.findReplaceString("abcd",
                                                                        new int[]{0, 2},
                                                                        new String[]{"a", "cd"},
                                                                        new String[]{"eee", "ffff"});
        System.out.println(abcd);

        System.out.println(findAndReplaceInString833.findReplaceString("abcd",
                                                                       new int[]{0, 2},
                                                                       new String[]{"ab", "ec"},
                                                                       new String[]{"eee", "ffff"}));

        System.out.println(findAndReplaceInString833.findReplaceString(
                "vmokgggqzp",
                new int[]{3, 5, 1},
                new String[]{"kg", "ggq", "mo"},
                new String[]{"s", "so", "bfr"}));
    }
}
