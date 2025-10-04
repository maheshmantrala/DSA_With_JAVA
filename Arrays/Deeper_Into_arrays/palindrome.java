package DSA.Arrays.Deeper_Into_arrays;

import java.util.Scanner;

public class palindrome {
     boolean isPalindrome=true;
    public static void main(String[] args) {
        // int arr[]={1,2,3,3,2,11};
        // boolean isPalindrome=true;
        // int left=0,right=arr.length-1;
        // while(left<right){
        //     if(arr[left]!=arr[right]){ isPalindrome=false; break;}
        //     left++;right--;
        // }
        // if(isPalindrome) System.out.println(" palindrome");
        // else System.out.println("not a Palindrome");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
         String str=sc.nextLine();
         int left=0,right=str.length()-1;
         boolean isPalindrome=true;
         while(left<right){
         if(str.charAt(left)!=str.charAt(right)){
        isPalindrome=false;
        break;
    }
    left++;right--;
    }
     System.out.println(isPalindrome?"Palindrome":"not palindrome");
     sc.close();
   }
}
    

