package DSA.Arrays.Basic_Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class CheckDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter" +n+ "elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // int[] arr={1,2,3,4,2,5,5,8,64,898,66,7,8,8,34,9,4};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> duplicatees=new HashSet<>();
       // boolean hasDuplicate=false;

        for(int num:arr){
            if(!set.add(num)){
                duplicatees.add(num);
            }
        }
        if(duplicatees.isEmpty()) System.out.println("No Duplicates found");
        else System.out.println("duplicates Found: "+duplicatees);
sc.close();
    }

}
