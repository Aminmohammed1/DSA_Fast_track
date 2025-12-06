/* 
3. Longest Substring Without Repeating Characters
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/


import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutDupes {
    
     public int lengthOfLongestSubstring(String s) {
        int mSS = 0;
        Set<Character> seen = new HashSet<>();
        int l = 0;
        for (int r = 0; r< s.length(); r++){
            while(seen.contains(s.charAt(r))){
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            int cL = (r - l)+1;
            mSS = Math.max(cL, mSS);
        }
        return mSS;
    }
}
