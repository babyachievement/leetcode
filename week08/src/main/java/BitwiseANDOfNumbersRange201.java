/**
 * date: 2019/8/5 9:56
 */

public class BitwiseANDOfNumbersRange201 {
    public int rangeBitwiseAnd(int m, int n) {
        if (m == 0) {
            return 0;
        }

        int i = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            i++;
        }

        return m << i;
    }
}
