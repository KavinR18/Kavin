/* Decompiler 7ms, total 469ms, lines 22 */
package looping;

public class Primenumberseries {
   public static void main(String[] args) {
      for(int i = 2; i < 100; ++i) {
         int c = 0;

         for(int j = 2; j < i; ++j) {
            if (i % j == 0) {
               ++c;
               break;
            }
         }

         if (c == 0) {
            System.out.println(i);
         }
      }

   }
}
