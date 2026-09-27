import java.util.*;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {
            char ch = s.charAt(i);

            if (ch == '(') {
                int start = i + 1;
                while (i < n && s.charAt(i) != ')') {
                    i++;
                }
                String key = s.substring(start, i);
                sb.append(map.getOrDefault(key, "?"));
            } else {
                sb.append(ch);
            }
            i++;
        }

        return sb.toString();
    }
}