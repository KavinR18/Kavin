
package looping;

public class Swappingoftwovariables {
   public static void main(String[] args) {
      int n1 = 5;
      int n2 = 17;
      n1 = n1 + n2;
      n2 = n1 - n2;
      n1 =n1-n2;
      System.out.println(n1);
      System.out.println(n2);
   }
}
