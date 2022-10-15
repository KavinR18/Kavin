package looping;

public class Printing1427256_ {
   public static void main(String[] args) {
      int a =1;

      for(int i = 1; i < 5; ++i) {
         a = 1;

         for(int j = 1; j <= i; ++j) {
            a *= i;
         }

         System.out.print(a + " ");
      }

   }
}
