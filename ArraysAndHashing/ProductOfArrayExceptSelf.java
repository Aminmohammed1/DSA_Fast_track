import java.util.Arrays;

public class ProductOfArrayExceptSelf {
   public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];
     int[] prefix = new int[nums.length];
     int[] postfix = new int[nums.length];
     for(int i=0; i < nums.length; i++){
        if(i==0){
            prefix[i]=nums[i];

        } 
        else {
            prefix[i] = nums[i]*prefix[i-1];

        }
     }   
     for(int j=nums.length-1; j>=0; j--){
        if(j == nums.length-1) {
            postfix[j] = nums[j];
        }
        else {
            postfix[j] = nums[j]*postfix[j+1];
        }
     }
     System.out.println(Arrays.toString(prefix));
     System.out.println(Arrays.toString(postfix));
     for (int i =0; i< nums.length; i++) {
        if(i ==0){
            ans[i] = 1*postfix[i+1];
        } else if (i == nums.length-1){
            ans[i] = 1*prefix[i-1];
            }
            
            else {
            ans[i] = prefix[i-1]*postfix[i+1];
        }
     }
     return ans;
    }

}
