
package patterns;

public class Pattern8 {
   public static void main(String[] args) {
      int n = 5;

      for(int i = 1; i <= n; ++i) {
         for(int j = n; j>0; j--) {
        	 if (i < j) {
                 System.out.print("  ");
              } else {
                 System.out.print(" *  ");
              }
         }
         System.out.println();}
         for(int i = 1; i <= n; ++i) {
             for(int j = 1; j <= n; ++j) {
                if (j < i) {
                   System.out.print("  ");
                } else {
                   System.out.print(" *  ");
                }
             }

             System.out.println();
          

      }

   }
}
