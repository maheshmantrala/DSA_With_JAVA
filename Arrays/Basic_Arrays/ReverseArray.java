package DSA.Arrays.Basic_Arrays;
//1️⃣ Reverse an Array
//Goal: Reverse the elements of an array in place.
//Example:
//Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1]

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
     int arr[]={21,22,23,24,25,26,27,28};
     int start=0,end=arr.length-1;
     while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;end--;
     }
     System.out.println(Arrays.toString(arr));
}
}