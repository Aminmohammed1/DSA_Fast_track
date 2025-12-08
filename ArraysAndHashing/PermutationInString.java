import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // build s1 freq
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int m = s1.length();
        int n = s2.length();

        // build initial window freq of size m
        for (int i = 0; i < m; i++) {
            char c = s2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // check the very first window
        if (map1.equals(map2)) return true;

        // slide window from index m to n-1
        for (int r = m; r < n; r++) {
            char add = s2.charAt(r);           // add new char on right
            char remove = s2.charAt(r - m);    // remove old char on left

            // add right char
            map2.put(add, map2.getOrDefault(add, 0) + 1);

            // remove left char
            map2.put(remove, map2.get(remove) - 1);
            if (map2.get(remove) == 0) {
                map2.remove(remove); // avoid zero entries
            }

            // check after update
            if (map1.equals(map2)) return true;
        }

        return false;
        
    }
}