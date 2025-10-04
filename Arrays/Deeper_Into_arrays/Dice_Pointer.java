package DSA.Arrays.Deeper_Into_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Dice_Pointer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target sum");
        int target=sc.nextInt();
        int dice[]={1,2,3,4,5,6};
        Arrays.sort(dice);
        int left=0,right=dice.length-1;
        int count=0;
        System.out.println("Pairs of dice rolls that sum to " + target + ":");
        while(left<=right){
         int sum=dice[left]+dice[right];
         if(sum==target){
            if(left==right){
                 System.out.println("(" + dice[left] + "," + dice[right] + ")");
                    count++;
                    break;
            }
            else{
                System.out.println("(" + dice[left] + "," + dice[right] + ")");
                System.out.println("(" + dice[right] + "," + dice[left] + ")");
                count+=2;
                left++;
                right--;
            }}
        else if(sum<target) left++;
        else right--;
         
         }
         System.out.println("Total pairs: " + count);
        System.out.println("Probability of sum " + target + " = " + (double) count / 36);
        sc.close();
        }

    }

