/* Decompiler 3ms, total 721ms, lines 20 */
package looping;

import java.util.Scanner;

public class Smallestdivisorofaninteger {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int n = sc.nextInt();

      for(int i = 2; i <= n; ++i) {
         if (n % i == 0) {
            System.out.println(i);
            break;
         }
      }

   }
}
