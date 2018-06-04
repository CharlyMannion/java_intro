public class Strings {
  public static void main(String[] args) {
    // declare the first name
    String x = "Charly";
    // declare the second name
    String y = "Habin";
    // create your message
    String newString = String.format("%s and %s are learning Java!", x, y);
    // print your message!
    System.out.println(newString);
  }
}
