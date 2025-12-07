public class LongestRepeatingSubString {

     public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxFreq = 0;
        int left = 0;
        int res = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count[c - 'A']++;
            
            // update the running max frequency
            maxFreq = Math.max(maxFreq, count[c - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // update result
            res = Math.max(res, right - left + 1);
        
        }
    return res;
}
    
}
