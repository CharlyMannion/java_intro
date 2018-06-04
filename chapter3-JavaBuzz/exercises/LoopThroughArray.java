// can you remember how to set up your main function?

// loop through an integer array and print out each element
import java.util.ArrayList;
import java.util.Arrays;
// can you remember how to set up your main function?
public class LoopThroughArray {
  public static void main(String args[]) {
// declare an array of Strings and print it
    String[] stringArray = { "Charly", "Igor", "Ellie", "Habin", "Anders", "Aseel" };
    System.out.println(stringArray[1]);
    for (String name : stringArray) {
      System.out.println(name);
    }
  }
}
