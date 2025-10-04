package DSA.Arrays.Deeper_Into_arrays;

import java.util.Scanner;

public class UniversalPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer or String to check whether it is palindrome or not");
        String input = sc.nextLine();
        boolean isPalindrome = false;

        // Integer check
        if(input.matches("\\d+")) {
            int left = 0, right = input.length() - 1;
            isPalindrome = true;
            while(left < right){
                if(input.charAt(left) != input.charAt(right)){
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            if(isPalindrome) System.out.println("Integer Palindrome");
            else System.out.println("Not an Integer Palindrome, checking as String...");
        }

        // String check
        if(!isPalindrome){
            int left = 0, right = input.length() - 1;
            isPalindrome = true;
            while(left < right){
                if(input.charAt(left) != input.charAt(right)){
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            if(isPalindrome) System.out.println("String Palindrome");
            else System.out.println("It is not a Palindrome");
        }

        sc.close();
    }
}
