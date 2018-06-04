import java.util.ArrayList;
import java.util.Arrays;
// can you remember how to set up your main function?
public class Array {
  public static void main(String args[]) {
// declare an array of Strings and print it
    String[] stringArray = { "Charly", "Igor", "Ellie", "Habin", "Anders", "Aseel" };
    System.out.println(stringArray[1]);
    for (String name : stringArray) {
      System.out.println(name);
    }
// declare an array of integers and print it
    int[] integersArray = new int[3];
    integersArray[0] = 10;
    integersArray[1] = 20;
    integersArray[2] = 30;
    System.out.println(integersArray[1]);
    for (int number : integersArray) {
      System.out.println(number);
    }
// declare an ArrayList of integers, add numbers to it, and then print it
    ArrayList<Integer> integerArrayList = new ArrayList<Integer>(2);
    integerArrayList.add(100);
    integerArrayList.add(200);
    System.out.println(integerArrayList.get(0));
    System.out.println(integerArrayList.get(1));
    for (int listNumber : integerArrayList) {
      System.out.println(listNumber);
    }
  }
}
