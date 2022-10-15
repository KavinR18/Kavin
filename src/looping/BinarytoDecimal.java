/* Decompiler 8ms, total 2069ms, lines 23 */
package looping;

import java.util.Scanner;

public class BinarytoDecimal {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a Binary number to conver decimal?");
      int binary = in.nextInt();
      int decimal = 0;
      int i = 0;

      for(boolean var5 = false; binary > 0; ++i) {
         int rem = binary % 10;
         decimal = (int)((double)decimal + (double)rem * Math.pow(2.0D, (double)i));
         System.out.println(decimal);
         binary /= 10;
      }

      System.out.println(decimal);
   }
}
