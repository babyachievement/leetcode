import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * date: 2019/7/15 17:03
 */

public class GoatLatin824 {
    public String toGoatLatin(String S) {

        final String[] words = S.split(" ");

        final int           length = words.length;
        final StringBuilder result = new StringBuilder();


        Set<Character> vowels = new HashSet<>();
        vowels.addAll(Arrays.asList('a',
                                    'e',
                                    'i',
                                    'o',
                                    'u',
                                    'A',
                                    'E',
                                    'I',
                                    'O',
                                    'U'

        ));
        for (int i = 0; i < length; i++) {
            final String word = words[i];
            if (vowels.contains(word.charAt(0))) {
                result.append(word);

            } else {
                result.append(word.substring(1))
                      .append(word.charAt(0));
            }

            result.append("ma");
            for (int j = 0; j < i + 1; j++) {
                result.append('a');
            }
            result.append(' ');
        }

        result.deleteCharAt(result.length() - 1);
        return result.toString();

    }
}
