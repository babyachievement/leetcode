import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * date: 2019/8/5 10:54
 */

public class MapSumPairs677 {
    Map<String, Integer> map = new HashMap<>();
    static class TrieNode {
        boolean        isLeaf;
        int            value;
        int            sum;
        List<TrieNode> children;

        public TrieNode(int value) {
            this.value = value;
        }

    }

    TrieNode root;

    public MapSumPairs677() {
        root = new TrieNode(Integer.MIN_VALUE);
    }


    /**
     * Inserts a word into the trie.
     */
    public void insert(String key, int val) {
        if (key == null || key.isEmpty()) {
            return;
        }

        int oldV = 0;
        if (map.containsKey(key)) {
            oldV = map.get(key);
        }else {
            map.put(key, val);
        }

        char[]   chars   = key.toCharArray();
        TrieNode current = root;
        for (char c : chars) {
            if (current.children == null) {
                current.children = new ArrayList<>();
                TrieNode trieNode = new TrieNode(c);
                current.children.add(trieNode);
                current = trieNode;
                current.sum += val - oldV;
            } else {
                boolean found = false;
                for (TrieNode child : current.children) {
                    if (child.value == c) {
                        found = true;
                        current = child;
                        current.sum += val- oldV;
                        break;
                    }
                }

                if (!found) {
                    TrieNode trieNode = new TrieNode(c);
                    trieNode.sum += val- oldV;
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
    public int search(String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }


        if (root.children == null) {
            return 0;
        }

        char[] charArray = word.toCharArray();
        for (TrieNode child : root.children) {
            if (child.value == charArray[0]) {
                return dfs(child, charArray, 0);
            }
        }

        return 0;
    }

    private int dfs(TrieNode trieNode, char[] chars, int offset) {

        if (trieNode != null && offset < chars.length) {
            if (trieNode.value == chars[offset] || chars[offset] == '.') {

                if (offset == chars.length - 1) {
                    return trieNode.sum;
                }
                List<TrieNode> children = trieNode.children;
                if (children == null) {
                    return 0;
                } else {
                    for (TrieNode child : children) {
                        if (chars[offset + 1] == child.value) {
                            return dfs(child, chars, offset + 1);
                        }
                    }
                }
            }
        }

        return 0;
    }


    public int sum(String prefix) {
        return search(prefix);
    }

    public static void main(String[] args) {
        final MapSumPairs677 mapSumPairs677 = new MapSumPairs677();
        mapSumPairs677.insert("apple", 3);
        System.out.println(mapSumPairs677.sum("ap"));
        mapSumPairs677.insert("app", 2);
        System.out.println(mapSumPairs677.sum("ap"));
    }
}
