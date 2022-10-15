/* Decompiler 2ms, total 326ms, lines 17 */
package looping;

public class PrintingFactorial {
   public static void main(String[] args) {
      for(int n = 5; n > 0; --n) {
         int j = 1;

         for(int i = 1; i <= n; ++i) {
            j = i * j;
         }

         System.out.println(j);
      }

   }
}
