import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * date: 2019/7/30 17:18
 */

public class MinimumHeightTrees310 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return Collections.singletonList(0);


        List<Set<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }

        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (list.get(i).size() == 1) {
                leaves.add(i);
            }
        }

        int i = n;
        while (n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (Integer leaf : leaves) {
                final Integer next = list.get(leaf).iterator().next();
                list.get(next).remove(leaf);
                if (list.get(next).size() == 1) {
                    newLeaves.add(next);
                }
            }
            leaves = newLeaves;
        }

        return leaves;
    }


    public static void main(String[] args) {
        final MinimumHeightTrees310 minimumHeightTrees310 = new MinimumHeightTrees310();
        System.out.println(minimumHeightTrees310.findMinHeightTrees(4,
                                                                    new int[][]{{1, 0}, {1,
                                                                            2}, {1, 3}}));

        System.out.println(minimumHeightTrees310.findMinHeightTrees(1,
                                                                    new int[][]{}));
    }
}
