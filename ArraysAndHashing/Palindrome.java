import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public boolean isPalindrome(String s) {
        List<Character> palindrome = new ArrayList<>();
        boolean containsNonAlpha = false;
        if(s.isEmpty()){
            return true;
        }
        int i =0;
        for(char c: s.toCharArray()){
            if(Character.isAlphabetic(s.charAt(i) ) || Character.isDigit(s.charAt(i))){
                palindrome.add(Character.toLowerCase(c));
            }
            else {
                containsNonAlpha = true;
            }
            i++;
        }
        int j=0;
        int k=palindrome.size()-1;
        while(j <= k){
            if(palindrome.get(j).equals(palindrome.get(k))){
                j++;
                k--;
            } else {
                return false;
            }
        }
        return true;

    }
}
