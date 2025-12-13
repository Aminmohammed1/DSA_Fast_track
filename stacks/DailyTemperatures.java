package stacks;

import java.util.Stack;

public class DailyTemperatures {
        public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i =0; i< temperatures.length; i++) {
            // int lastTemp = stack.peek().get()
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int sIndex = stack.pop();
                ans[sIndex] = i - sIndex;
            }
            stack.add(i);
        }
        return ans;
        

    }
    
}
