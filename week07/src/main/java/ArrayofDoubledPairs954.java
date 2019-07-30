import java.util.Arrays;
import java.util.LinkedList;

/**
 * date: 2019/7/29 13:30
 */

public class ArrayofDoubledPairs954 {
    public boolean canReorderDoubled(int[] A) {
        if (A == null || A.length % 2 != 0) return false;

        if (A.length == 0) {
            return true;
        }

        Arrays.sort(A);

        LinkedList<Integer> set = new LinkedList<>();


        int i = 0;
        while (i < A.length && A[i] < 0) {
            if (!set.isEmpty()&&set.getFirst() == 2 * A[i]) {
                set.removeFirst();
            } else {
                set.addLast(A[i]);
            }
            i++;
        }

        if (!set.isEmpty()) {
            return false;
        }

        for (int j = A.length - 1; j >= i && j >= 0; j--) {
            if (!set.isEmpty()&&set.getFirst() == 2 * A[j]) {
                set.removeFirst();
            } else {
                set.addLast(A[j]);
            }
        }


        return set.isEmpty();
    }

    public static void main(String[] args) {
        final ArrayofDoubledPairs954 arrayofDoubledPairs954 = new ArrayofDoubledPairs954();
        System.out.println(arrayofDoubledPairs954.canReorderDoubled(new int[]{2, 1, 2, 1, 1, 1, 2, 2}));
        System.out.println(arrayofDoubledPairs954.canReorderDoubled(new int[]{-2,-6,-3,4,-4,2}));
    }
}
