package patterns;

public class Pattern9 {
   public static void main(String[] args) {
      int n = 6;

      for(int i = 1; i <= n; ++i) {
         for(int j = 1; j <= n; ++j) {
        	 if(i==2 ||i==n-1) {
            	 if(j==n/2+1 ||j==n/2-1)
            	 System.out.print("* ");
            	 else
            		 System.out.print("  ");
             }
        	 else if(i==1 ||i==n) {
        	 if(j==n/2)
        	 System.out.print("* ");
        	 else
        		 System.out.print("  ");
         }
        	 else if(i==3 || i==n-2)
        	 {
        		 if(j==n/2+2 ||j==n/2-2)
        			 System.out.print("* ");
        		 else
        			 System.out.print("  ");
        	 }
         else
        	 System.out.print("  ");
         }
         System.out.println();
      }

   }
}
