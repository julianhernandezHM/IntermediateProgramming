import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) throws Exception {
        int[] Array = new int[10]; {
            Random rand = new Random();
        
            for (int i = 0; i < Array.length; i++) {
                Array[i] = rand.nextInt(2,21);
                System.out.println(Array[i]);
                }
            
            }
        }
        
        
}
