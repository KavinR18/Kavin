/* Decompiler 3ms, total 275ms, lines 18 */
package looping;

public class FibonacciSeries {
   public static void main(String[] args) {
      int n1 = -1;
      int n2 = 1;

      for(int i = 0; i < 10; ++i) {
         n1 += n2;
         System.out.print(" " + n1);
         n1 += n2;
         n2 = n1 - n2;
         n1 -= n2;
      }

   }
}
