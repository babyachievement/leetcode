/**
 * date: 2018/9/20 17:57
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.List;

public class ImplementTrie208 {
    static class TrieNode {
        boolean        isLeaf;
        int            value;
        List<TrieNode> children;

        public TrieNode(int value) {
            this.value = value;
        }
    }

    TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public ImplementTrie208() {
        root = new TrieNode(Integer.MIN_VALUE);
    }


    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word == null || word.isEmpty()) {
            return;
        }

        char[]   chars   = word.toCharArray();
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
     * Returns if the word is in the trie.
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
            if (dfs(child, charArray, 0, false)) {
                return true;
            }
        }

        return false;
    }

    private boolean dfs(TrieNode trieNode, char[] chars, int offset, boolean isPrefix) {

        if (trieNode != null && offset < chars.length) {
            if (trieNode.value == chars[offset] || chars[offset] == '.') {
                if (offset == chars.length - 1) {
                    if (isPrefix) {
                        return true;
                    }
                }
                if (trieNode.isLeaf && offset == chars.length - 1) {
                    return true;
                }
                List<TrieNode> children = trieNode.children;
                if (children == null) {
                    return dfs(null, chars, offset + 1, isPrefix);
                } else {
                    for (TrieNode child : children) {
                        if (dfs(child, chars, offset + 1, isPrefix)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.isEmpty()) {
            return false;
        }


        if (root.children == null) {
            return false;
        }

        char[] charArray = prefix.toCharArray();
        for (TrieNode child : root.children) {
            if (dfs(child, charArray, 0, true)) {
                return true;
            }
        }
        return false;
    }
}
