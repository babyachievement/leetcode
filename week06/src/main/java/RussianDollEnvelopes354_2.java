import java.util.Arrays;
import java.util.Comparator;

public class RussianDollEnvelopes354_2 {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0) {
            return 0;
        }


        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                }

                return o1[0] - o2[0];
            }
        });

        int[] height = new int[envelopes.length];

        int len = 0;
        for(int[] envelope : envelopes){
            int index = Arrays.binarySearch(height, 0, len, envelope[1]);
            if(index < 0)
                index = -(index + 1);
            height[index] = envelope[1];
            if(index == len)
                len++;
        }
        return len;
    }

    public static void main(String[] args) {
        RussianDollEnvelopes354_2 russianDollEnvelopes354 = new RussianDollEnvelopes354_2();
//        System.out.println(russianDollEnvelopes354.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
        System.out.println(russianDollEnvelopes354.maxEnvelopes(new int[][]{{4,5},{4,6},{6,7},{2,3},{1,1}}));
    }
}
