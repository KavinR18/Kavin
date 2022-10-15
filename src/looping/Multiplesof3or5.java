/* Decompiler 3ms, total 263ms, lines 13 */
package looping;

public class Multiplesof3or5 {
   public static void main(String[] args) {
      for(int n = 1; n <= 50; ++n) {
         if (n % 3 == 0 || n % 5 == 0) {
            System.out.print(n + " ");
         }
      }

   }
}
