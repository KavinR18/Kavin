/* Decompiler 11ms, total 286ms, lines 26 */
package looping;

import java.util.Scanner;

public class NeonNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int n = sc.nextInt();
      int temp = n * n;

      int sum;
      for(sum = 0; temp > 0; temp /= 10) {
         int rem = temp % 10;
         sum += rem;
      }

      if (n == sum) {
         System.out.println(n + " is a neon number");
      } else {
         System.out.println(n + "is not a neon number");
      }

   }
}
