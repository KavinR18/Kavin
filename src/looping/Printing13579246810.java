/* Decompiler 3ms, total 267ms, lines 20 */
package looping;

public class Printing13579246810 {
   public static void main(String[] args) {
      int i;
      for(i = 1; i <= 10; ++i) {
         if (i % 2 != 0) {
            System.out.print(i);
         }
      }

      for(i = 1; i <= 10; ++i) {
         if (i % 2 == 0) {
            System.out.print(i);
         }
      }

   }
}
