/**
 * date: 2019/7/29 15:39
 */

public class NumberofEnclaves1020 {
    public int numEnclaves(int[][] A) {
        if(A==null||A.length==0||A[0].length==0) return 0;

        for(int i=0; i<A[0].length; i++) {
            color(A, 0, i);
        }

        for(int i=0; i<A[0].length; i++) {
            color(A, A.length-1, i);
        }

        for(int i=0; i<A.length; i++) {
            color(A, i, 0);
        }

        for(int i=0; i<A.length; i++) {
            color(A, i, A[0].length-1);
        }


        int count = 0;
        for(int i=0; i<A.length; i++) {

            for(int j=0; j<A[0].length; j++) {
                if(A[i][j]==1) count++;
            }
        }

        return count;
    }

    void color(int[][] A, int i, int j) {
        if(i>=A.length) return;
        if(j>=A[0].length) return;
        if(i<0) return;
        if(j<0) return;

        if(A[i][j]==1) {
            A[i][j] =0;
            color(A, i-1, j);
            color(A, i, j-1);
            color(A, i, j+1);
            color(A, i+1,j);
        }
    }
}
