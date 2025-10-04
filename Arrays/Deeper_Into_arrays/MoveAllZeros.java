package DSA.Arrays.Deeper_Into_arrays;

import java.util.Arrays;

/*
 * 🧠 Concept

Use two pointers:

One pointer (nonZeroIndex) tracks where to place the next non-zero number.

Second pointer (i) iterates through array.
 */
public class MoveAllZeros {
    public static void main(String[] args) {
        int[] arr={1,000,65,0,674367,0,12,4};
        int nonZeroIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[nonZeroIndex];
                arr[nonZeroIndex]=temp;
                nonZeroIndex++;
            }
        } 
        System.out.println("Array after moving all zeros to right is "+Arrays.toString(arr));
    }
}

/*⚡ Time Complexity

O(n) → single loop through the array.

O(1) → no extra space used. */