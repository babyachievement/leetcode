/**
 * date: 2018/10/23 16:41
 */

package com.babyachievement.top.interviews;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * https://leetcode.com/problems/word-ladder/description/
 */
public class WordLadder127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList == null || wordList.isEmpty()) {
            return 0;
        }

        final List<Set<Integer>> indexList = buildGraph(wordList, beginWord);

        for (int i = 0; i < indexList.size(); i++) {
            final Set<Integer> index = indexList.get(i);
            for (Integer id : index) {
                if (wordList.get(id.intValue()).equals(endWord)) {
                    return i + 2;
                }
            }
        }

        return 0;
    }


    /**
     * 建立一个graph
     *
     * @param wordList
     * @param beginWord
     * @return
     */
    List<Set<Integer>> buildGraph(List<String> wordList, String beginWord) {
        List<Set<Integer>> graph = new ArrayList<>();

        boolean[] used = new boolean[wordList.size()];
        Set<Integer> currentLevel;

        currentLevel = new HashSet<>();
        for (int i = 0; i < wordList.size(); i++) {
            if (canChange(beginWord, wordList.get(i))) {
                currentLevel.add(Integer.valueOf(i));
                used[i] = true;
            }
        }

        graph.add(currentLevel);

        while (true) {
            Set<Integer> newLevel = new HashSet<>();
            for (Integer index : currentLevel) {
                for (int j = 0; j < wordList.size(); j++) {
                    if (!used[j] && canChange(
                            wordList.get(index.intValue()),
                            wordList.get(j))) {
                        used[j] = true;
                        newLevel.add(j);
                    }
                }
            }

            if (newLevel.isEmpty()) {
                break;
            } else {
                currentLevel = newLevel;
                graph.add(newLevel);
            }
        }


        return graph;
    }


    boolean canChange(String fromWord, String endWorld) {
        if (fromWord.length() != endWorld.length()) {
            return false;
        }

        int count = 0;
        for (int i = 0; i < fromWord.length(); i++) {
            if (fromWord.charAt(i) != endWorld.charAt(i)) {
                count++;
            }
        }

        return count == 1;
    }

    public int ladderLength2(String start, String end, List<String> dict) {
        // Use queue to help BFS
        Queue<String> queue = new LinkedList<String>();
        queue.add(start);
        queue.add(null);

        // Mark visited word
        Set<String> visited = new HashSet<String>();
        visited.add(start);

        int level = 1;

        while (!queue.isEmpty()) {
            String str = queue.poll();

            if (str != null) {
                // Modify str's each character (so word distance is 1)
                for (int i = 0; i < str.length(); i++) {
                    char[] chars = str.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[i] = c;

                        String word = new String(chars);
                        if (word.equals(end)) return level + 1;

                        // Put it to the queue
                        if (dict.contains(word) && !visited.contains(word)) {
                            queue.add(word);
                            visited.add(word);
                        }
                    }
                }


            } else {
                level++;

                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            }
        }

        return 0;
    }


    public int ladderLength3(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;

        Set<String> words = new HashSet<String>(wordList);
        words.remove(beginWord);
        words.remove(endWord);

        Set<String> begins = new HashSet<String>();
        Set<String> ends = new HashSet<String>();
        begins.add(beginWord);
        ends.add(endWord);

        int ans = 1;
        while(!begins.isEmpty() && !ends.isEmpty()) {
            ans++;
            if (begins.size() <= ends.size()) {
                if (next(begins, ends, words)) return ans;
            } else {
                if (next(ends, begins, words)) return ans;
            }
        }
        return 0;
    }

    // from.size() < to.size()
    public boolean next(Set<String> from, Set<String> to, Set<String> word) {
        String[] fromStrings = from.toArray(new String[from.size()]);
        for (String s : fromStrings) {
            char[] sc = s.toCharArray();
            for (int i = 0; i <sc.length; i++) {
                char tmp = sc[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    sc[i] = c;
                    String scs = String.valueOf(sc);
                    if (to.contains(scs)) return true;
                    if (word.contains(scs)) {
                        from.add(scs);
                        word.remove(scs);
                    }
                }
                sc[i] = tmp;
            }
            from.remove(s);
        }
        return false;
    }
}
