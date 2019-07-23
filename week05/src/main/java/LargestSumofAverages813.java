/**
 * date: 2019/7/17 17:26
 */

public class LargestSumofAverages813 {
    public double largestSumOfAverages(int[] A, int K) {
        int      N = A.length;
        double[] sum = new double[N + 1];
        for (int i = 0; i < N; ++i)
            sum[i + 1] = sum[i] + A[i];

        double[] dp = new double[N];
        for (int i = 0; i < N; ++i)
            dp[i] = (sum[N] - sum[i]) / (N - i);

        for (int k = 0; k < K - 1; ++k)
            for (int i = 0; i < N; ++i)
                for (int j = i + 1; j < N; ++j)
                    dp[i] = Math.max(dp[i], (sum[j] - sum[i]) / (j - i) + dp[j]);

        return dp[0];
    }

    public static void main(String[] args) {
        final LargestSumofAverages813 largestSumofAverages813 = new LargestSumofAverages813();
        System.out.println(largestSumofAverages813.largestSumOfAverages(new int[]{9,1,2,3,9}, 3));
    }
}
