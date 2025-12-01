import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
   //brute force approach 
    // public String encode(List<String> strs) {
    //             System.out.println("Arry to string"+(strs.toString()));


    //     if(strs.isEmpty()){
    //         return "";
    //     }
    //     StringBuilder s = new StringBuilder();
    //     for(String str: strs){
    //         s.append(str+"randomSting");
    //     }
    //     return s.toString();
    // }

    // public List<String> decode(String str) {
    //     System.out.println("this is inpt"+ str);
    //     if(str.isEmpty()){
    //         return new ArrayList<>();
    //     }
    //     if(str.length() == 11 && str.contains("randomSting")){
    //         return new ArrayList<>(Arrays.asList(""));
    //     }
    //     List<String> ans = new ArrayList<>(Arrays.asList(str.split("randomSting")));
    //     return ans;
    // }


    //optimized approach :

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s: strs) {
            str.append(s.length()).append("#").append(s);
        }
        return str.toString();
    }

    public List<String> decode(String s) {
        if(s.isEmpty()) return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        int i =0;
        while(i < s.length()) {
            int j = s.indexOf("#", i);
            int len = Integer.parseInt(s.substring(i, j));
            String actualString = s.substring(j+1, j+1+len);
            ans.add(actualString);
            i = len+j+1;
        }
        
        if (true) {
            
        }
        
        return ans;
    }

}
