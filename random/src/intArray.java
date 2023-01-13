import java.util.Random;

public class intArray {
   
    int[] Array; {

    Array = new int[10];

    for (int i = 0; i < Array.length; i++) {
        Random rand = new Random();
        System.out.println("this is random integer: " +rand.nextInt(2,21));
        }
    }
}

