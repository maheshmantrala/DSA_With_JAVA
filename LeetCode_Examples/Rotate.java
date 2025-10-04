package DSA.LeetCode_Examples;

import java.util.Arrays;

public class Rotate {

public static void reverse(int nums[],int k){
    k%=nums.length;
    rotate(nums,0,nums.length-1);
    rotate(nums,0, k-1);
    rotate(nums, k, nums.length-1);
}

public static void rotate(int nums[],int left,int right){
  while (left<right) {
     int temp=nums[left];
     nums[left]=nums[right];
     nums[right]=temp;
     left++;
     right--;
  }
  
    }
     public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println("Before Rotation "+Arrays.toString(nums));
        reverse(nums, 3);
        System.out.println("After Rotation "+Arrays.toString(nums)); 
    }
}
