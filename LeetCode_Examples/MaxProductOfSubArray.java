package DSA.LeetCode_Examples;

import java.util.Arrays;
/*
 🎯 Goal of Maximum Product Subarray
We are given an array of integers (which may include positive, negative, and zero).
We need to find the maximum product of a contiguous subarray.
Contiguous → elements must be next to each other (like [2,3] or [-2,4], not skipping indexes).
Product → multiply all numbers in that subarray.
We want the largest possible value across all subarrays.
 */
public class MaxProductOfSubArray {
     public static int maxproduct(int nums[]){
    int n = nums.length;
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];
        for (int i = 1; i < n; i++) {
            int current = nums[i];
            if (current < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(current, maxProd * current);
            minProd = Math.min(current, minProd * current);
            result = Math.max(result, maxProd);
            System.out.println("Iteration " + i + " -> num=" + current +
                               " | maxProd=" + maxProd +
                               " | minProd=" + minProd +
                               " | result=" + result);
        }
        return result;
        }
        public static void main(String[] args) {
        int[] arr1 = {2, 3, -2, 4};
        int[] arr2 = {-2, 0, -1}; 
        int[] arr3 = {-1, -2, -9, -6};
        System.out.println("Your 1 st array is"+Arrays.toString(arr1));
        System.out.println("Max Product 1: " + maxproduct(arr1));
         System.out.println("Your 2nd array is"+Arrays.toString(arr2));
        System.out.println("Max Product 2: " + maxproduct(arr2)); 
        System.out.println("Your 3rd array is"+Arrays.toString(arr3));
        System.out.println("Max Product :3 " + maxproduct(arr3));
    }
}
