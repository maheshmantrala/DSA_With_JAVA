package DSA.Arrays.Basic_Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr={-23,4,5,667,8568,547,43473446,35467};
        int max=arr[0],min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("max is: "+max);
        System.out.println("min is: "+min);
    }
}
