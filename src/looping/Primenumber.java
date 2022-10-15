/* Decompiler 3ms, total 290ms, lines 22 */
package looping;

public class Primenumber {
   public static void main(String[] args) {
      int n = 17;
      int c = 1;

      for(int i = 2; i < n; ++i) {
         if (n % i == 0) {
            ++c;
         }
      }

      if (c > 2) {
         System.out.println("not a prime number");
      } else {
         System.out.println("prime number");
      }

   }
}
