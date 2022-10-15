/* Decompiler 2ms, total 1887ms, lines 17 */
package looping;

public class Additionoffirstnnumbers {
   public static void main(String[] args) {
      int n = 10;
      int j = 0;

      for(int i = 1; i <= n; ++i) {
         j += i;
         System.out.print(i + " ");
      }

      System.out.println();
      System.out.println(j);
   }
}
