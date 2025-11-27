/*  Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false
 */


import java.util.HashMap;
import java.util.Map;

class FindDuplicateNumberInArray {


    public boolean hasDuplicate(int[] nums) {
        
        
        // brute force
        // for (int i =0; i< nums.length; i++){
        //     int j;
        //     for(j =i+1; j<nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

            //optimized approach
        Map<Integer, Integer> allNums = new HashMap<>();
        for (int i =0; i< nums.length; i++) {
            if (!allNums.containsKey(nums[i])){
               allNums.put(nums[i], i);

            }
            else {
                return true;
            }
        }
        return false;

        
    }
}