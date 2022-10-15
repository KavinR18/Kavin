/* Decompiler 2ms, total 476ms, lines 15 */
package looping;

public class Factorial {
   public static void main(String[] args) {
      int n = 5;
      int j = 1;

      for(int i = 1; i <= n; ++i) {
         j = i * j;
      }

      System.out.println(j);
   }
}
