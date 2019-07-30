import java.util.Arrays;

public class LongestArithmeticSequence1027 {
    public int longestArithSeqLength(int[] A) {
        if (A == null) {
            return 0;
        }

        if (A.length < 2) {
            return A.length;
        }


        int[][] dp = new int[A.length][A.length];

        for (int i = 0; i < A.length; i++) {
            Arrays.fill(dp[i], 2);
        }


        int[] index = new int[20001];
        Arrays.fill(index, -1);

        int max = 2;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int pre = 2 * A[i] - A[j];
                if (pre < 0 || index[pre] == -1) continue;
                dp[i][j] = dp[index[pre]][i] + 1;
                max = Math.max(dp[i][j], max);
            }
            index[A[i]] = i;
        }


        return max;
    }

    public static void main(String[] args) {
        LongestArithmeticSequence1027 longestArithmeticSequence1027 = new LongestArithmeticSequence1027();
        System.out.println(longestArithmeticSequence1027.longestArithSeqLength(new int[]{3, 6, 9, 12}));
        System.out.println(longestArithmeticSequence1027.longestArithSeqLength(new int[]{9, 4, 7, 2, 10}));
        System.out.println(longestArithmeticSequence1027.longestArithSeqLength(new int[]{20, 1, 15, 3, 10, 5, 8}));
        System.out.println(longestArithmeticSequence1027.longestArithSeqLength(new int[]{24, 13, 1, 100, 0, 94, 3, 0, 3}));
    }
}
