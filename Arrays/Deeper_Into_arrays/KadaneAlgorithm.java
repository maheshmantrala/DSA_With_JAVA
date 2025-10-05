package DSA.Arrays.Deeper_Into_arrays;

public class KadaneAlgorithm {
    public static int maxSubArraysum(int nums[]){
    int currsum=nums[0];
    int maxsum=nums[0];
    for(int i=1;i<nums.length;i++){
       currsum=Math.max(nums[i], currsum+nums[i]);
       maxsum=Math.max(maxsum, currsum);
    }
       return maxsum;
    }
    public static void main(String[] args) {
        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr2 = {5, 4, -1, 7, 8};
        int[] arr3 = {-1, -2, -3, -4};
       System.out.println("The max sum of subarray is "+maxSubArraysum(arr1));
       System.out.println("The max sum of subarray is "+maxSubArraysum(arr2));
       System.out.println("The max sum of subarray is "+maxSubArraysum(arr3));
    }
}
