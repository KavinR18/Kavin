/* Decompiler 4ms, total 283ms, lines 33 */
package looping;

import java.util.Scanner;

public class StrongNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int n = sc.nextInt();
      int temp = n;

      int sum;
      for(sum = 0; n > 0; n /= 10) {
         int n1 = n % 10;
         int fact = 1;

         for(int j = 1; j <= n1; ++j) {
            fact *= j;
         }

         System.out.println(fact);
         sum += fact;
      }

      if (sum == temp) {
         System.out.println(temp + " is a strong number");
      } else {
         System.out.println(temp + " is not a strong number");
      }

   }
}
