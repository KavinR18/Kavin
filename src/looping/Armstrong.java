/* Decompiler 4ms, total 3421ms, lines 26 */
package looping;

import java.util.Scanner;

public class Armstrong {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int n = sc.nextInt();
      int sum = 0;

      int temp;
      for(temp = n; n != 0; n /= 10) {
         int i = n % 10;
         sum += i * i * i;
      }

      if (sum == temp) {
         System.out.println("Armstrong number");
      } else {
         System.out.println("Not an Armstrong number");
      }

   }
}
