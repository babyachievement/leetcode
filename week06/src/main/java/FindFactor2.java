import java.util.LinkedList;

/**
 * date: 2019/7/24 17:13
 */

public class FindFactor2 {

    private LinkedList<Integer> result = new LinkedList<>();

    void findFactor2(int sum, int n) {
        if (sum < 0 || n < 0) {
            return;
        }

        if (sum == 0) {
            for (Integer integer : result) {
                System.out.print(integer + " ");
            }
            System.out.println();
            return;
        }

        result.addLast(n);
        findFactor2(sum - n, n - 1);
        result.removeLast();
        findFactor2(sum, n - 1);

    }

    public static void main(String[] args) {
        final FindFactor2 findFactor2 = new FindFactor2();
        findFactor2.findFactor2(4, 8);
    }
}
