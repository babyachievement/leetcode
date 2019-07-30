/**
 * date: 2019/7/22 14:33
 */

public class StatisticsFromALargeSample1093 {
    public double[] sampleStats(int[] count) {
        double[] result = new double[5];
        result[0] = Double.MAX_VALUE;
        result[1] = Double.MIN_VALUE;

        double sum   = 0;
        int    total = 0;
        int maxOccr = 0;

        for (int i = 0; i < count.length - 1; i++) {
            sum += count[i] * i;
            total += count[i];
            if (count[i] > 0) {
                if (result[0] == Double.MAX_VALUE) {
                    result[0] = i;
                }
                result[1] = i;
                if (maxOccr < count[i]) {
                    maxOccr = count[i];
                    result[4] = i;
                }
            }
        }

        result[2] = sum / total;

        int mid = total/2;


        return result;

    }
}
