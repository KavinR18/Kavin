/* Decompiler 6ms, total 1653ms, lines 15 */
package looping;

public class AdditionofFirstNnumbers {
   public static void main(String[] args) {
      int n = 15;
      int sum = 0;

      for(int i = 0; i <= n; ++i) {
         sum += i;
      }

      System.out.println(sum);
   }
}
