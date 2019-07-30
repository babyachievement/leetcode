/**
 * date: 2019/7/30 15:16
 */

public class NRepeatedElementInSize2NArray961 {
    public int repeatedNTimes(int[] A) {
        for(int i=1; i<=3; i++) {
            for(int j=0; j<A.length-i; j++) {
                if(A[j]==A[j+i])
                    return A[j];
            }
        }

        throw null;
    }

    public static void main(String[] args) {
        final NRepeatedElementInSize2NArray961 nRepeatedElementInSize2NArray961 = new NRepeatedElementInSize2NArray961();
        nRepeatedElementInSize2NArray961.repeatedNTimes(new int[]{9, 5, 6, 9});
    }
}
