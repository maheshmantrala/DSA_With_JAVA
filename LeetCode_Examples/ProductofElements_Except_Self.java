package DSA.LeetCode_Examples;

import java.util.Arrays;
import java.util.Scanner;

public class ProductofElements_Except_Self {
    public static int[] product(int nums[]){
     int output[]=new int[nums.length];
     output[0]=1;
     for(int i=1;i<nums.length;i++){
      output[i]=output[i-1]*nums[i-1];
     }
     int suffix=1;
     for(int i=nums.length-1;i>=0;i--){
       output[i]*=suffix;
       suffix*=nums[i];
     }
     return output;
}
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n=sc.nextInt();
        System.out.println("Enter Elements in array");
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
           nums[i]= sc.nextInt();
        }
        int []ans=product(nums);
       System.out.println("Product of array except self: " + Arrays.toString(ans));
        sc.close();
    }
}
