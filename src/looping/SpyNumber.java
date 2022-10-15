/* Decompiler 7ms, total 291ms, lines 28 */
package looping;

import java.util.Scanner;

public class SpyNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int n = sc.nextInt();
      int temp = n;
      int sum = 0;

      int product;
      for(product = 1; n > 0; n /= 10) {
         int rem = n % 10;
         sum += rem;
         product *= rem;
      }

      if (sum == product) {
         System.out.println(temp + " is a spy number");
      } else {
         System.out.println(temp + " is not a spy number");
      }

   }
}
