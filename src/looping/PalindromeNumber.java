package looping;

import java.util.Scanner;

public class PalindromeNumber {
   public static void main(String[] args) {
      Scanner S = new Scanner(System.in);
      System.out.println("enter a number");
      int n = S.nextInt();
      int sum = 0;
      int rev = 0;

      int check;
      for(check = n; n > 0; n /= 10) {
          sum = n % 10;
         rev = rev * 10 + sum;
      }

      if (check == rev) {
         System.out.println(rev + " is a palindrome");
      } else {
         System.out.println("Not a Palindrome number");
      }

   }
}
