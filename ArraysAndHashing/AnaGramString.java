/*
    Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.

*/




import java.util.HashMap;
import java.util.Map;

public class AnaGramString {
    
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i =0; i< s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                int count = map.get(s.charAt(i));
                map.put(s.charAt(i), count+1);
            } else{
                map.put(s.charAt(i), 0);
            }
        }
        // for (int i =0; i<t.length(); i++){
        //     // if(!anaGram.add(t.charAt(i))){
        //     //     // return true;
        //     // }
        //     // else{
        //     //     return false;
        //     // }
        //     if (map2.containsKey(t.charAt(i))){
        //         int count2 = map2.get(t.charAt(i));
        //         map2.put(t.charAt(i), count2+1);
        //     }
        //     else {
        //         map2.put(t.charAt(i), 0);

        //     }
        // }
        // // System.out.println(map.entrySet());
        // // System.out.println(map2.entrySet());

        // for(int i =0; i < s.length(); i++){
        //     if(!map.get(s.charAt(i)).equals(map2.get(s.charAt(i)))){
        //         return false;
        //     }
        // }

        // return true;

        //using one map...
        for (char c : t.toCharArray()){
            if (!map.containsKey(c)){
                return false;
            }
            map.put(c, map.get(c)-1);
            if(map.get(c)<0) return false;
        }
        return true;
    }
}