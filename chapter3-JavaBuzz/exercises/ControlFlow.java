// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?
public class ControlFlow {
  public static void main(String args[]) {
    int a;
// find a way to read in user input
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer");
    while ((a = in.nextInt()) != 17) {
    // a = in.nextInt();
    if (a % 2 == 0) {
      System.out.println("You entered an even integer " + a);
      System.out.println("Enter an integer");
    }
     else {
       System.out.println("You entered an odd integer: " + a);
       System.out.println("Enter an integer");
     }
   }
  }
}
