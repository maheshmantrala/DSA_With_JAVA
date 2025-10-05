package DSA.LeetCode_Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Prefix_Sum_indices {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        int n=num.length;
        int prefix[]=new int[n];
        prefix[0]=num[0];
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("This is your Entered Array "+Arrays.toString(num));
    System.out.println("Enter L and R (0-based indices): ");
        int L = sc.nextInt();
        int R = sc.nextInt();
            if(L>=0 && R<n){
            int rangesum=(L==0)?prefix[R]:prefix[R]-prefix[L-1];
       System.out.println("Sum from index " + L + " to " + R + " = " + rangesum);
            }
            else{
                System.out.println("Out of range");
            }  
        sc.close();  
    }

     
}
