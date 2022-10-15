/* Decompiler 2ms, total 339ms, lines 17 */
package looping;

public class Noofdigits {
   public static void main(String[] args) {
      int n = 978790;
      int n1 = 0;

      int count;
      for(count = 0; n > 0; n /= 10) {
         n1 = n % 10;
         ++count;
      }

      System.out.println(count);
   }
}
