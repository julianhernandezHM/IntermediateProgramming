import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class NumberGuessGameUnclean {
    public static void main(String[] args) throws Exception {
        
        int max = 101; 
        Random InitialNumber = new Random();
        int int_random = InitialNumber.nextInt(max); 
        System.out.println("Random integer value from 0 to " + (max-1) + " : "+ int_random);
    

        //ArrayList and adds the Random Number
        ArrayList<Integer> NumbersList = new ArrayList();
        //NumbersList.add(NumbersList.size(), int_random);
        
    //    for(int i = 0; i < NumbersList.size(); i++) {   
    //        System.out.println(NumbersList.get(i));
   //    }  
        




        //Ask for Number
        Scanner AskforNumber = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number from 0-100");
        //String NumberInput = AskforNumber.nextLine();  // Read user input
        // int VerifiedNumber = Integer.parseInt(NumberInput); // Does this work? Look at .hasNextInt

        //Check if Input is Int.
        while (true) {
            
            //Check if input is an integer
            if (AskforNumber.hasNextInt()) {
                int NumberInput = AskforNumber.nextInt();

                //Check if the Number is in the ArrayList
                 //In ArrayList
                if( NumbersList.contains(NumberInput)) {
                    AskforNumber.next();
                    System.out.println( "You have already used this number. Pick again" );
                }

                //Not in ArrayList
                else {
                    NumbersList.add(NumbersList.size(), NumberInput);
                    //run through list and see if list has int_random
                    if (NumberInput == int_random){//for(int i = 0; i < NumbersList.size(); i++) {  
                        //If the there is a number that matches the random number
                         //if(i == int_random){
                            System.out.println("Correct! The number is " + int_random + " You solved it in " + NumbersList.size() + " tries!");
                            break;
                         }
                        //When the input does not match the random number
                         else{
                            if(NumberInput < int_random){
                                //AskforNumber.next();
                                System.out.println("Too Low! The number is greater than " + NumberInput);
                            }
                            if(NumberInput> int_random){
                               // AskforNumber.next();
                                System.out.println("Too High! The number is less than " + NumberInput);
                             } 

                         }
                        //System.out.println(NumbersList.get(i));
                    }  


                }
                
            else {
                // Consume the wrong input
                AskforNumber.next();
                System.out.println("Please enter a valid integer");        
            }
        }



        



        
        

        



    }
}
