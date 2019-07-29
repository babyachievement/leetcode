import java.util.Arrays;
import java.util.HashSet;

/**
 * date: 2019/7/29 15:49
 */

public class LetterTilePossibilities1079 {
    public int numTilePossibilities(String tiles) {
        final char[]    chars  = tiles.toCharArray();
        HashSet<String> result = new HashSet<>();

        for (int i = 1; i <= tiles.length(); i++) {
            find(result, new StringBuilder(), i, 0, chars);
        }
        return result.size();
    }

    private void find(HashSet<String> result, StringBuilder stringBuilder, int length, int index, char[]  tiles) {
        if (length == 0) {
            result.add(stringBuilder.toString());
            return;
        }

        for (int i = index; i < tiles.length; i++) {
            for (int j = i; j < tiles.length; j++) {
                swap(tiles, i, j);
                stringBuilder.append(tiles[i]);
                find(result, stringBuilder, length - 1, i + 1, tiles);
                stringBuilder.setLength(stringBuilder.length() - 1);
                swap(tiles, i, j);
            }
        }
    }

    private void swap(char[] tiles, int i, int j) {
        char temp = tiles[i];
        tiles[i] = tiles[j];
        tiles[j] = temp;
    }

    public int numTilePossibilities2(String tiles) {
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        return helper(chars, 0, chars.length, 1, 1, 0, new int['Z' - 'A' + 1]);
    }

    // a/b is the number of unique permutations given characters in counts.
    // m is sum(counts).
    static int helper(char[] chars, int i, int n, int a, int b, int m, int[] counts) {
        int result = 0;
        a *= (++m); // add one to m, and update a == m!.
        for(int j = i; j < n; ++j) {
            int index = chars[j] - 'A';
            if (j == i || chars[j] != chars[j-1]) { // generate unique subset.
                // b maintains the product of counts[i]! for each counts[i] != 0.
                b *= (++counts[index]);
                result += a / b + helper(chars, j + 1, n, a, b, m, counts);
                b /= (counts[index]--);
            }
        }
        return result;
    }
}
