/* Decompiler 2ms, total 318ms, lines 14 */
package looping;

public class Printingseries {
   public static void main(String[] args) {
      int j = 1;

      for(int i = 1; i < 10; ++i) {
         ++j;
         System.out.println(i + "*" + j + "=" + i * j);
      }

   }
}
