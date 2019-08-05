/**
 * date: 2019/8/2 16:47
 */

public class SubarraySumsDivisibleByK974 {
    public int subarraysDivByK(int[] A, int K) {
        if (A == null || A.length == 0) return 0;

        int[] sum = new int[A.length + 1];


        int count = 0;
        for (int i = 1; i < A.length + 1; i++) {
            sum[i] = sum[i - 1] + A[i-1];
            for (int j = 0; j < i; j++) {
                if ((sum[i] - sum[j]) % K == 0) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        final SubarraySumsDivisibleByK974 subarraySumsDivisibleByK974 = new SubarraySumsDivisibleByK974();
        System.out.println(subarraySumsDivisibleByK974.subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1},
                                                                       5));
    }
}
