import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * date: 2019/7/29 16:50
 */

public class ReplaceWords648 {
    static class TrieNode {
        boolean        isLeaf;
        int            value;
        List<TrieNode> children;

        public TrieNode(int value) {
            this.value = value;
        }
    }

    TrieNode root = new TrieNode(Integer.MIN_VALUE);


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


    public boolean search(String word, StringBuilder sb) {
        if (word == null || word.isEmpty()) {
            return false;
        }


        if (root.children == null) {
            return false;
        }

        char[] charArray = word.toCharArray();
        for (TrieNode child : root.children) {
            if (dfs(child, charArray, 0, sb)) {
                return true;
            }
        }

        return false;
    }

    private boolean dfs(TrieNode trieNode, char[] chars, int offset, StringBuilder stringBuilder) {

        if (trieNode != null && offset < chars.length) {
            if (trieNode.value == chars[offset]) {
                stringBuilder.append(((char) trieNode.value));

                if (trieNode.isLeaf) {
                    return true;
                }
                List<TrieNode> children = trieNode.children;
                if (children == null) {
                    return false;
                } else {
                    for (TrieNode child : children) {
                        if (dfs(child, chars, offset + 1,
                                stringBuilder)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    public String replaceWords(List<String> dict, String sentence) {
        for (String s : dict) {
            insert(s);
        }

        Map<String, String> map = new HashMap<>();

        final StringBuilder result = new StringBuilder();
        int                 i      = 0;
        while (i < sentence.length()) {

            if (Character.isAlphabetic(sentence.charAt(i))) {
                int j = i + 1;
                while (j < sentence.length() && Character.isAlphabetic(sentence.charAt(j))) j++;

                final StringBuilder sb        = new StringBuilder();
                final String        substring = sentence.substring(i, j);
                if (map.containsKey(substring)) {
                    result.append(map.get(substring));
                } else if (search(substring, sb)) {
                    final String str = sb.toString();
                    result.append(str);
                    map.put(substring, str);
                } else {
                    result.append(substring);
                }
                i = j;
            } else {
                result.append(sentence.charAt(i++));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        final ReplaceWords648 replaceWords648 = new ReplaceWords648();
        System.out.println(replaceWords648.replaceWords(Arrays.asList("cat",
                                                                      "bat",
                                                                      "rat"),
                                                        "the cattle was rattled by the battery"));
    }
}
