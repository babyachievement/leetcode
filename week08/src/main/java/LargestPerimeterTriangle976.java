import java.util.Arrays;

/**
 * date: 2019/8/5 14:09
 */

public class LargestPerimeterTriangle976 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);

        int max = 0;
        for (int i = A.length-1; i >=2 ; i--) {
            if (A[i] >= A[i - 1] + A[i - 2]) {
                continue;
            }else {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        final LargestPerimeterTriangle976 largestPerimeterTriangle976 = new LargestPerimeterTriangle976();
        System.out.println(largestPerimeterTriangle976.largestPerimeter(new int[]{2, 1, 2}));
        System.out.println(largestPerimeterTriangle976.largestPerimeter(new int[]{1,2,1}));
        System.out.println(largestPerimeterTriangle976.largestPerimeter(new int[]{3,2,3,4}));
        System.out.println(largestPerimeterTriangle976.largestPerimeter(new int[]{3,6,2,3}));
    }
}
