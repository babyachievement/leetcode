/**
 * date: 2018/9/12 18:33
 */

package org.babyachievement.algorithms.binarytree;

import java.util.*;

/**
 * https://blog.csdn.net/zjucor/article/details/75199971
 */
public class AutocompleteSystem {
    static class TrieNode {
        boolean isLeaf;
        int count;
        String value;
        TrieNode[] children = new TrieNode[27];
    }

    StringBuilder input = new StringBuilder();
    TrieNode root;

    public AutocompleteSystem(String[] sentences, int[] times) {
        root = new TrieNode();
        for (int i = 0; i < sentences.length; i++) {
            saveSentence(sentences[i], times[i]);
        }
    }

    void saveSentence(String sentence, int time) {
        if (sentence == null || sentence.isEmpty()) {
            return;
        }

        char[] chars = sentence.toCharArray();
        TrieNode pre = root;

        TrieNode current = null;
        int index;
        for (char c : chars) {
            if (c == ' ') {
                index = 26;
                current = pre.children[index];
            } else {
               index = c - 'a';
                current = pre.children[index];
            }

            if (current == null) {
                current = new TrieNode();
                pre.children[index] = current;
            }

            pre = current;
        }

        current.isLeaf = true;
        current.value = sentence;
        current.count += time;
    }

    public List<String> input(char c) {
        switch (c) {
            case '#':
                saveSentence(input.toString(), 1);
                input = new StringBuilder();
                break;
            default:
                input.append(c);
                return search(input.toString());

        }

        return new ArrayList<>();
    }

    private List<String> search(String prefix) {
        if (prefix.isEmpty()) {
            return new ArrayList<>();
        }

        char[] chars = prefix.toCharArray();
        TrieNode current = root;
        for (int i = 0; i < chars.length && current != null; i++) {
            if (chars[i] == ' ') {
                if ((current = current.children[26]) == null) {
                    break;
                }
            } else {
                current = current.children[chars[i] - 'a'];
            }
        }

        if (current != null) {
            List<TrieNode> trieNodes = new ArrayList<>();
            dfsSearch(current, trieNodes);

            Collections.sort(trieNodes, new Comparator<TrieNode>() {
                @Override
                public int compare(TrieNode o1, TrieNode o2) {
                    if (o1.count == o2.count) {
                        return o1.value.compareTo(o2.value);
                    }

                    return o2.count - o1.count;
                }
            });

            List<String> result = new ArrayList<>();
            int c = 0;
            for (TrieNode trieNode : trieNodes) {
                result.add(trieNode.value);
                c++;
                if (c == 3) {
                    break;
                }
            }

            return result;
        }


        return new ArrayList<>();
    }

    private void dfsSearch(TrieNode current, List<TrieNode> trieNodes) {
        if (current == null) {
            return;
        }
        if (current.isLeaf) {
            trieNodes.add(current);
        }

        TrieNode[] children = current.children;
        for (TrieNode child : children) {
            dfsSearch(child, trieNodes);
        }
    }
}