import java.util.ArrayList;
import java.util.List;

public class BraceExpression1087 {
    public String[] expand(String S){
        List<String> list = new ArrayList<>();

        int length = S.length();

        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == '{') {
                int j = i+1;
                StringBuilder sb = new StringBuilder();
                while (j < length && S.charAt(j) != '}') {
                    if (S.charAt(j) == ',') {
                        j++;
                        continue;
                    }

                    sb.append(S.charAt(j));
                    j++;
                }
                list.add(sb.toString());
                i = j;
            }else {
                list.add(S.charAt(i) + "");
            }
        }

        List<String> result = new ArrayList<>();

        dfs(list, result, new StringBuilder(), 0);

        return result.toArray(new String[0]);

    }

    private void dfs(List<String> list, List<String> result, StringBuilder stringBuilder, int cur) {
        if (cur == list.size()) {
            result.add(stringBuilder.toString());
            return;
        }

        for (int i = 0; i < list.get(cur).length(); i++) {
            stringBuilder.append(list.get(cur).charAt(i));
            dfs(list, result, stringBuilder, cur+1);
            stringBuilder.setLength(stringBuilder.length()-1);
        }
    }

    public static void main(String[] args) {
        BraceExpression1087 braceExpression1087 = new BraceExpression1087();
        String[] expand = braceExpression1087.expand("{a,b}c{d,e}f");
        for (String s : expand) {
            System.out.println(s);
        }
    }
}
