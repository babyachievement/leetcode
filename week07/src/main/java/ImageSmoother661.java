/**
 * date: 2019/7/30 15:08
 */

public class ImageSmoother661 {
    public static final int[][] direction = new int[][]{
            {-1, 0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1, -1},{1,1}
    };
    public int[][] imageSmoother(int[][] M) {
        int rows = M.length;
        int cols = M[0].length;
        int[][] result = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                result[i][j] = getAvg(M, i, j);
            }
        }

        return result;
    }

    public int getAvg(int[][] M, int i, int j) {
        int sum = M[i][j];
        int count = 1;

        int rows = M.length;
        int cols = M[0].length;


        for(int[]dir: direction) {
            if(i+dir[0]>=0 && i+dir[0]<rows && j+dir[1]>=0 && j+dir[1]<cols) {
                count++;
                sum += M[i+dir[0]][j+dir[1]];
            }
        }

        sum+=M[i][j];

        return sum/count;

    }
}
