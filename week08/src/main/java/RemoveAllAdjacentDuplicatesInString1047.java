/**
 * date: 2019/8/5 13:29
 */

public class RemoveAllAdjacentDuplicatesInString1047 {
    public String removeDuplicates(String S) {
        final StringBuilder stringBuilder = new StringBuilder();

        final char[] chars        = S.toCharArray();
        boolean      shouldRemove = false;
        int          pre          = 0;
        for (int i = 0; i < chars.length; i++) {
//            if (i > 0 && chars[i] == chars[i - 1]) {
//                continue;
//            }


            final int length = stringBuilder.length();
            if (length > 0 && chars[i] == stringBuilder.charAt(length - 1)) {
                stringBuilder.setLength(length - 1);
            } else {
                stringBuilder.append(chars[i]);
            }

        }


        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        final RemoveAllAdjacentDuplicatesInString1047 removeAllAdjacentDuplicatesInString1047 = new RemoveAllAdjacentDuplicatesInString1047();
        System.out.println(removeAllAdjacentDuplicatesInString1047.removeDuplicates(
                "abbaca"));
    }
}
