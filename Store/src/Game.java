import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {

    Instrument Mic = new Instrument (25, 1000);
    Instrument Guitar = new Instrument (15, 500);
    Instrument Drums = new Instrument (5, 250);

    Instrument newMic = new Instrument(1, 1000);
    Instrument newGuitar = new Instrument(2, 500);
    Instrument newDrums = new Instrument(3, 250);
    
    PlayerStats newPlayer = new PlayerStats(0, 1000);

    ArrayList<Instrument> InstrumentList = new ArrayList();


    // "go through each item in the list an 'get' its percentIncrease and add them togetehr to equal percentWin " for loop

    int AddPercentages(){
        for (int i = 1; i < InstrumentList.size(); i++) {

            int totalPercentage = newPlayer.percentWin;
            totalPercentage += InstrumentList.get(i).percentIncrease;
            newPlayer.percentWin = totalPercentage;

            return newPlayer.percentWin;
            System.out.println(newPlayer.percentWin);
            
        }
    }
        // alternate: return input.get(maxIndex) - can get the student 
]
    }

    

            Game(){
       
                // Ask for minimum integer
                Scanner StoreFront = new Scanner(System.in);
                System.out.println("Welcome to your new journey to become the greatest musician alive! What will be your first Instrument? A Mic? Guitar? or Drums? ");

                // Create array list to add instruments to 
         

                //Check if input is integer
                while(true){
                    if (StoreFront = "mic") {
                        InstrumentList.add(Mic);
                        newPlayer.percentwin

                    

                    
                }
                }
            }
 }
}
    
