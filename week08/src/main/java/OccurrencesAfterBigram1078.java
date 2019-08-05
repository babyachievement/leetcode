import java.util.Arrays;

/**
 * date: 2019/8/5 14:00
 */

public class OccurrencesAfterBigram1078 {
    public String[] findOcurrences(String text, String first, String second) {

        final String[] split = text.split(" ");
        final String[] result = new String[split.length];
        int i = 0;


        for (int j = 2; j < split.length; j++) {
            if (first.equals(split[j-2]) && second.equals(split[j-1])) {
                result[i++] = split[j];
            }
        }

        return Arrays.copyOf(result, i);
    }
}
