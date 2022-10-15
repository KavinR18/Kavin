/* Decompiler 3ms, total 1002ms, lines 22 */
package looping;

public class LCM {
   public static void main(String[] args) {
      int n1 = 3;
      int n2 = 10;
      int big=0;
      if (n1 > n2) {
         big = n1;
      } else {
         big = n2;
      }

      while(big % n1 != 0 || big % n2 != 0) {
         ++big;
      }

      System.out.println("LCM is " + big);
   }
}
