package DSA.LeetCode_Examples;

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {
    public static int[] Twosum(int nums[],int target,String mode){
         HashMap<Integer,Integer>map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
       int complement=target-nums[i];
       if (map.containsKey(complement)){
        if(mode=="indices"){
              return new int[]{map.get(complement),i};
        }
        else if(mode=="pair"){
            return new int[]{complement,nums[i]};
        }
       }
       map.put(nums[i],i);
     }
     return new int[]{};
    }

       public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        
        // ✅ Case 1: Return indices
        int[] ans1 = Twosum(nums, target, "indices");
        System.out.println("Indices: " + Arrays.toString(ans1));

        // ✅ Case 2: Return pair
        int[] ans2 = Twosum(nums, target, "pair");
        System.out.println("Pair: " + Arrays.toString(ans2));
    }
}

