/**
 * date: 2018/9/11 9:59
 */

package org.babyachievement.algorithms.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/add-and-search-word-data-structure-design/description/
 */
public class AddAndSearchWord {
    static class TrieNode {
        boolean isLeaf;
        int value;
        List<TrieNode> children;

        public TrieNode(int value) {
            this.value = value;
        }
    }

    TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public AddAndSearchWord() {
        root = new TrieNode(Integer.MIN_VALUE);
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        if (word == null || word.isEmpty()) {
            return;
        }

        char[] chars = word.toCharArray();
        TrieNode current = root;
        for (char c : chars) {
            if (current.children == null) {
                current.children = new ArrayList<>();
                TrieNode trieNode = new TrieNode(c);
                current.children.add(trieNode);
                current = trieNode;
            } else {
                boolean found = false;
                for (TrieNode child : current.children) {
                    if (child.value == c) {
                        found = true;
                        current = child;
                        break;
                    }
                }

                if (!found) {
                    TrieNode trieNode = new TrieNode(c);
                    current.children.add(trieNode);
                    current = trieNode;
                }
            }
        }

        current.isLeaf = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }


        if (root.children == null) {
            return false;
        }

        char[] charArray = word.toCharArray();
        for (TrieNode child : root.children) {
            if (dfs(child, charArray, 0)) {
                return true;
            }
        }

        return false;
    }

    public boolean dfs(TrieNode trieNode, char[] chars, int offset) {

        if (trieNode != null && offset < chars.length) {
            if (trieNode.value == chars[offset] || chars[offset] == '.') {
                if (trieNode.isLeaf && offset == chars.length - 1) {
                    return true;
                }
                List<TrieNode> children = trieNode.children;
                if (children == null) {
                    return dfs(null, chars, offset + 1);
                } else {
                    for (TrieNode child : children) {
                        if (dfs(child, chars, offset + 1)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
