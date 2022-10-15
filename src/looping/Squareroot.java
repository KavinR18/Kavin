/* Decompiler 2ms, total 315ms, lines 16 */
package looping;

public class Squareroot {
   public static void main(String[] args) {
      int n = 81;

      for(int i = 2; i <= n / 2; ++i) {
         if (n / i == i) {
            System.out.println(i);
            break;
         }
      }

   }
}
