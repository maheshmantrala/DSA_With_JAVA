package DSA.LeetCode_Examples;

import java.util.Arrays;

public class majorityone{
    public static int malority(int nums[]){
        int candidate=0;
        int count=0;
        for(int num:nums){
            if(count==0)candidate=num;
            count+=(candidate==num)?1:-1;
        }
           return candidate;
    }
 public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {3, 2, 3};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Majority Element: " + malority(nums1));

        // Test Case 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.println("Majority Element: " + malority(nums2));

        // Test Case 3
        int[] nums3 = {1, 1, 1, 2, 3, 1, 4};
        System.out.println("\nInput: " + Arrays.toString(nums3));
        System.out.println("Majority Element: " + malority(nums3));

        // Test Case 4
        int[] nums4 = {5, 5, 5, 5, 2, 2, 5, 3, 5};
        System.out.println("\nInput: " + Arrays.toString(nums4));
        System.out.println("Majority Element: " + malority(nums4));

        // Test Case 5
        int[] nums5 = {7, 7, 8, 7, 9, 7, 10, 7, 7};
        System.out.println("\nInput: " + Arrays.toString(nums5));
        System.out.println("Majority Element: " + malority(nums5));
    }
}
