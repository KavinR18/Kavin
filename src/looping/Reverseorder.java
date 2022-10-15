package looping;

import java.util.Scanner;

public class Reverseorder {
   public static void main(String[] args) {
      Scanner S = new Scanner(System.in);
      System.out.println("enter a number");
      int n = S.nextInt();
      int sum;

      int rev;
      for(rev = 0; n > 0; n /= 10) {
         sum = n % 10;
         rev = rev * 10 + sum;
      }

      System.out.println(rev);
   }
}
