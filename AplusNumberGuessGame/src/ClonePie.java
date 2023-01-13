import java.util.ArrayList;
import java.util.Scanner;

public class ClonePie {
    public static void main(String[] args) throws Exception {
        ArrayList<NameScoreIndex> leaderboard = new ArrayList<>();
        leaderboard.add(new NameScoreIndex (5, "Kyle"));
    
    }


    static void AddToLeaderboard(ArrayList<NameScoreIndex> leaderboard) {
        Scanner Name =  new Scanner(System.in);
        System.out.println("What is your name");
       
        NameScoreIndex rank = leaderboard.get(0);
        int current_score = leaderboard.get(0).Highscore; //Pie.getNumber();

        for (int i = 0; i < leaderboard.size(); i++){
            int user_score = leaderboard.get(i).Highscore;

            if (user_score< current_score){
                leaderboard.add((user_score, Name));

            }
            
        }
        

        for(int i = 0; i < leaderboard.size(); i++){
            System.out.print(leaderboard.get(i));
      
            
        }
    }
}