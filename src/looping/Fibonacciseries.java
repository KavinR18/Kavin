/* Decompiler 3ms, total 480ms, lines 18 */
package looping;

public class Fibonacciseries {
   public static void main(String[] args) {
      int n1 = -1;
      int n2 = 1;
      int n3 = 0;

      for(int i = 0; i < 20; ++i) {
         n3 = n1 + n2;
         System.out.print(n3 + " ");
         n1 = n2;
         n2 = n3;
      }

   }
}
