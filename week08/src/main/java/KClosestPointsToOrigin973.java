import java.util.Arrays;
import java.util.Comparator;

/**
 * date: 2019/8/5 9:31
 */

public class KClosestPointsToOrigin973 {
    public int[][] kClosest(int[][] points, int K) {
        if (points == null || points.length == 0 || points[0].length == 0)
            return new int[0][0];

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] * o1[0] + o1[1] * o1[1]) - (o2[0] * o2[0] + o2[1] * o2[1]);
            }
        });

        return Arrays.copyOfRange(points, 0, K);


    }
}
