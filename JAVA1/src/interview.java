import java.util.Scanner;  // Import the Scanner class

public class interview {
 
  public static void main(String[] args) throws Exception {
   
      Scanner question = new Scanner(System.in);
      System.out.println("What's your favorite icecream");
      
      String flavor = question.nextLine();

      if (flavor.contains("chocolate")) {
        System.out.println("Good choice");
      }
      else {
        System.out.println("You should like chocolate");
      } 
      System.out.println("Your favorite icecream is: " + flavor);
  }
}