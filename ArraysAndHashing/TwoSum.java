
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //brute force solution...
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j;
        j = i+1;
        while(i < nums.length-1){
            System.out.println(i +" "+ j);
            if (nums[i]+nums[j] == target) {
                return new int[]{i, j};
            }
            
            if (j==nums.length-1){
                i++;
                j=i+1;
            } else{

                j++;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSums(int[] nums, int target) {
    //Optimized solution...
        Map<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i< nums.length; i++){
            int remainingToSubtract = target - nums[i];
            if (map.containsKey(remainingToSubtract)){
                return new int[]{map.get(remainingToSubtract), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
