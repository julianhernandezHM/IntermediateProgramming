import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

// How many games played
// Save Tries
// Average Tries per game
//

public class GuessLoop {
    public static void main(String[] args) throws Exception {
    ArrayList<Game> games = new ArrayList<Game>();

    Scanner sc = new Scanner(System.in);
    
    boolean keepPlaying = true;

    while(keepPlaying){
        games.add(new Game());
        System.out.println("Would you like to play again? Enter: y");
        keepPlaying = sc.nextLine().equals("y");


    }
    System.out.println("Thanks for playing!");

        

}
}