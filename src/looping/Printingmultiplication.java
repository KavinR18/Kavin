/* Decompiler 2ms, total 332ms, lines 16 */
package looping;

public class Printingmultiplication {
   public static void main(String[] args) {
      int n = 10;
      int j = n;

      for(int i = 1; i <= n; ++i) {
         int mul = i * j;
         System.out.println(i + "*" + j + "=" + mul);
         --j;
      }

   }
}
