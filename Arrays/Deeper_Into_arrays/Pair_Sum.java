package DSA.Arrays.Deeper_Into_arrays;

import java.util.Arrays;

public class Pair_Sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,5};
        Arrays.sort(arr);
        int target=9;
        int left=0,right=arr.length-1;
        boolean found=false;
       while(left<right){
        int sum=arr[left]+arr[right];
        if(sum==target){
            System.out.println("pair found:("+arr[left]+","+arr[right]+")");
             found=true;
             int currentLeft = arr[left];
                int currentRight = arr[right];
                while (left < right && arr[left] == currentLeft) left++;
                while (left < right && arr[right] == currentRight) right--;
            
        }
        else if(sum<target){
            left++; 
        }
        else{
        right--;
        }
       }
       if(!found){
        System.out.println("No pair matches the target");
       }
    
        }
}
