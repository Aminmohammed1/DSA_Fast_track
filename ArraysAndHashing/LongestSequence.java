import java.util.*;

public class LongestSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length<=1){
            return nums.length;
        }
        int longest = 1;

        Set<Integer> numbers = new HashSet<>();
        
        for (int n : nums){
            numbers.add(n);
        }

        for(int n: numbers){
            if(!numbers.contains(n-1)){
                int current = n;
                int length=1;
                while(numbers.contains(current+1)){
                    current +=1;
                    length++;
                    longest = Math.max(length, longest);
                }
            } 
        }
        return longest;

        
    }
    
}
