import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * date: 2019/7/29 14:58
 */

public class PascalsTriangleII119 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 1) return Arrays.asList(1);
        if (rowIndex == 2) return Arrays.asList(1, 1);

        List<Integer> pre = Arrays.asList(1, 1);
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    current.add(1);
                } else {
                    current.add(pre.get(j - 1) + pre.get(j));
                }
            }

            pre = current;
        }

        return pre;
    }
}
