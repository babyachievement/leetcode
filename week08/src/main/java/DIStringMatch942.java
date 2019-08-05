/**
 * date: 2019/8/5 13:54
 */

public class DIStringMatch942 {
    public int[] diStringMatch(String S) {
        final int N = S.length();

        int i = 0;
        int j = N;

        final int[]         result          = new int[N+1];
        final StringBuilder stringBuilder = new StringBuilder();


        for (int k = 0; k < S.length(); k++) {
            if (S.charAt(k) == 'D') {
                result[k] = j--;
            }else {
                result[k] = i++;
            }
        }

        result[S.length()] = i++;

        return result;
    }
}
