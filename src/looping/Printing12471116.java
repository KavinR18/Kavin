package looping;

public class Printing12471116 {
   public static void main(String[] args) {
      int i = 1;
      int j = 0;
      int sum = 0;

      for( j = 0; j <= 10; ++j) {
          sum = i + j;
         i = sum;
         System.out.print(sum + " ");
      }

   }
}
