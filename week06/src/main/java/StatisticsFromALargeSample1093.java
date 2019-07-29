import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * date: 2019/7/22 14:33
 */

public class StatisticsFromALargeSample1093 {
    List<? extends StatisticsFromALargeSample1093>        t = new ArrayList<>();
    Map<String, ? extends StatisticsFromALargeSample1093> t2 = new HashMap<>();

    static {
        i = 0;
    }
    static int i = 1;

    public double[] sampleStats(int[] count) {
        double[] result = new double[5];
        result[0] = Double.MAX_VALUE;
        result[1] = Double.MIN_VALUE;

        double sum   = 0;
        int    total = 0;
        int maxOccr = 0;

        for (int i = 0; i < count.length - 1; i++) {
            sum += count[i] * i;
            total += count[i];
            if (count[i] > 0) {
                if (result[0] == Double.MAX_VALUE) {
                    result[0] = i;
                }
                result[1] = i;
                if (maxOccr < count[i]) {
                    maxOccr = count[i];
                    result[4] = i;
                }
            }
        }

        result[2] = sum / total;

        int mid = total/2;


        return result;

    }

    public static void main(String[] args2) {
        final Field[] declaredFields = StatisticsFromALargeSample1093.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            final Type     genericType = declaredField.getGenericType();


            if (genericType instanceof ParameterizedType) {
                final ParameterizedType parameterizedType = (ParameterizedType) genericType;
                Class<?> rawType = (Class<?>) parameterizedType.getRawType();
                Type[] typeArgs = parameterizedType.getActualTypeArguments();

                for (Type typeArg : typeArgs) {
                    System.out.println(typeArg.getTypeName());
                }
                System.out.println(rawType);
//                System.out.println(parameterizedType.getTypeName());
            }
        }


        ArrayList<String> list = new ArrayList<String>();
        ArrayList list1 = list;
        list1.add(12);
        System.out.println(list1.get(0));

        System.out.println(StatisticsFromALargeSample1093.i);
    }
}
