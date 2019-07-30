/**
 * date: 2019/7/24 16:05
 */

public class GetLongestSymmetricalLength {
    public int solute(String str) {
        final char[] chars = str.toCharArray();
        int i = 0;
        int maxLength = 0;
        while (i < chars.length) {
            int left = i-1;
            int right = i+1;

            while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
                left--;
                right++;
            }

            maxLength = Math.max(maxLength, right - left - 1);

            left = i;
            right = i+1;
            while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
                left--;
                right++;
            }
            maxLength = Math.max(maxLength, right - left - 1);

            i++;
        }

        return maxLength;

    }

    public static void main(String[] args) {
        final GetLongestSymmetricalLength getLongestSymmetricalLength = new GetLongestSymmetricalLength();
        System.out.println(getLongestSymmetricalLength.solute("goog"));
    }
}
