/**
 * date: 2019/7/18 11:34
 */

public class GuessNumberHigherOrLowerII375 {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n+1; j++) {
                dp[i][j] = 0;
            }
        }

        return maxCost(dp, 1, n);
    }

    int maxCost(int[][] cost, int start, int end) {
        if (start >= end) {
            return 0;
        }
        int result = Integer.MAX_VALUE;

        if (cost[start][end] != 0) {
            return cost[start][end];
        }

        for (int i = start; i < end + 1; i++) {
            int temp = i + Math.max(maxCost(cost, start, i - 1), maxCost(cost,
                                                                         i + 1,
                                                                         end));
            if (result > temp) {
                result = temp;
            }
        }
        cost[start][end] = result;
        return result;
    }

    public static void main(String[] args) {
        final GuessNumberHigherOrLowerII375 guessNumberHigherOrLowerII375 = new GuessNumberHigherOrLowerII375();
        System.out.println(guessNumberHigherOrLowerII375.getMoneyAmount(10));
    }
}
