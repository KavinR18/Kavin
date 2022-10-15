/* Decompiler 3ms, total 356ms, lines 25 */
package looping;

public class GCD {
   public static void main(String[] args) {
      int n = 4;
      int m = 24;
      int sum = 0;
      int small = 0;
     
      if (n > m) {
         small = m;
      } else {
         small = n;
      }

      for(int i = 2; i <= small; ++i) {
         if (n % i == 0 && m % i == 0) {
            System.out.println(i);
            break;
         }
      }

   }
}
