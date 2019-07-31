import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * date: 2019/7/31 9:27
 */

public class SatisfiabilityOfEqualityEquations990 {
    public boolean equationsPossible(String[] equations) {

        List<Set<Character>> equal    = new ArrayList<>();
        List<Set<Character>> notEqual = new ArrayList<>();
        boolean[]            visited  = new boolean[26];
        for (int i = 0; i < 26; i++) {
            equal.add(new HashSet<>());
            notEqual.add(new HashSet<>());
        }


        for (String equation : equations) {
            final char l = equation.charAt(0);
            final char r = equation.charAt(3);
            if (equation.charAt(1) == '!') {
                if (l == r) {
                    return false;
                } else if (isEqual(equal, l, r, visited)||isEqual(equal, r, l, visited)) {
                    return false;
                } else {
                    notEqual.get(l - 'a').add(r);
                    notEqual.get(r - 'a').add(l);
                }
            } else {
                if (l != r) {

                    if (isNotEqual(equal, notEqual, l, r, visited) || isNotEqual(equal, notEqual, r, l, visited)) {
                        return false;
                    }else {
                        equal.get(l - 'a').add(r);
                        equal.get(r - 'a').add(l);
                    }
                }
            }

        }

        return true;
    }

    public boolean isEqual(List<Set<Character>> equal, char s, char target, boolean[] visited) {
        if (visited[s - 'a']) {
            return false;
        }

        final Set<Character> characters = equal.get(s - 'a');
        if (characters.contains(target)) {
            return true;
        }

        visited[s - 'a'] = true;
        boolean e = false;
        for (Character character : characters) {
            if (isEqual(equal, character, target, visited)) {
                e = true;
                break;
            }
        }
        visited[s - 'a'] = false;
        return e;
    }

    public boolean isNotEqual(List<Set<Character>> equal, List<Set<Character>> notEqual, char s,
                              char target, boolean[] visited) {
        if (visited[s - 'a']) {
            return false;
        }

        final Set<Character> not = notEqual.get(s - 'a');
        if (not.contains(target)) {
            return true;
        }


        final Set<Character> characters = equal.get(s - 'a');
        if (characters.contains(target)) {
            return false;
        }

        boolean e = false;
        visited[s - 'a'] = true;
        for (Character character : characters) {
            if (isNotEqual(equal, notEqual, character, target, visited)) {
                e = true;
                break;
            }
        }

        visited[s - 'a'] = false;
        return e;
    }


    int[] roots = new int[26];
    public boolean equationsPossible2(String[] equations) {
        if(equations.length == 0)
            return false;
        for(int i=0; i<26; i++)
            roots[i] = i;
        for(int i=0; i<equations.length; i++){
            if(equations[i].charAt(1) == '=')
                roots[find(equations[i].charAt(0)-'a')] = roots[find(equations[i].charAt(3)-'a')];
        }
        for(int i=0; i<equations.length; i++){
            if(equations[i].charAt(1) == '!')
                if(roots[find(equations[i].charAt(0)-'a')] == roots[find(equations[i].charAt(3)-'a')])
                    return false;
        }
        return true;
    }
    public int find(int x){
        if(x != roots[x])
            roots[x] = find(roots[x]);
        return roots[x];
    }

    public static void main(String[] args) {
        final SatisfiabilityOfEqualityEquations990 satisfiabilityOfEqualityEquations990 = new SatisfiabilityOfEqualityEquations990();
        satisfiabilityOfEqualityEquations990.equationsPossible2(new String[]{
                "a==b", "b!=c", "c==a"});
    }
}
