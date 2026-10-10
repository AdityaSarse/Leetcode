
import java.util.*;

class Solution {
    public List<String> braceExpansionII(String expression) {
        Set<String> result = new TreeSet<>(expand(expression));
        return new ArrayList<>(result);
    }

    private Set<String> expand(String s) {
        Set<String> result = new HashSet<>();
        Set<String> current = new HashSet<>();
        current.add("");

        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            Set<String> part;

            if (ch == '{') {
                int j = i + 1;
                int balance = 1;

                while (j < s.length() && balance > 0) {
                    if (s.charAt(j) == '{') balance++;
                    else if (s.charAt(j) == '}') balance--;
                    j++;
                }

                part = expand(s.substring(i + 1, j - 1));
                i = j;
            } else if (ch == ',') {
                result.addAll(current);
                current.clear();
                current.add("");
                i++;
                continue;
            } else {
                part = new HashSet<>();
                part.add(String.valueOf(ch));
                i++;
            }

            Set<String> next = new HashSet<>();

            for (String a : current) {
                for (String b : part) {
                    next.add(a + b);
                }
            }

            current = next;
        }

        result.addAll(current);
        return result;
    }
}
