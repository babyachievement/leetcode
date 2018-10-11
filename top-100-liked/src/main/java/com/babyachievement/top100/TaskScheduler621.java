/**
 * date: 2018/10/11 13:58
 */

package com.babyachievement.top100;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/task-scheduler/description/
 */
public class TaskScheduler621 {

    /**
     * https://leetcode.com/problems/task-scheduler/discuss/104496/concise-java-solution-on-time-o26-space
     * Let F be the set of most frequent chars with frequency k.
     * We can create k chunks, each chunk is identical and is a string consists of chars in F in a specific fixed order.
     * Let the heads of these chunks to be H_i; then H_2 should be at least n chars away from H_1, and so on so forth;
     * then we insert the less frequent chars into the gaps between these chunks sequentially one by one ordered by frequency
     * in a decreasing order and try to fill the k-1 gaps as full or evenly as possible each time you insert a character.
     * In summary, append the less frequent characters to the end of each chunk of the first k-1 chunks sequentially and round and round,
     * then join the chunks and keep their heads' relative distance from each other to be at least n.
     * @param tasks
     * @param n
     * @return
     */
    public int leastInterval(char[] tasks, int n) {
        int[] c = new int[26];
        for (char t : tasks) {
            c[t - 'A']++;
        }
        Arrays.sort(c);
        int i = 25;
        final int mx = c[25];
        while (i >= 0 && c[i] == mx) i--;

        // tasks.length
        return Math.max(tasks.length, (mx - 1) * (n + 1) + 25 - i);
    }
}
