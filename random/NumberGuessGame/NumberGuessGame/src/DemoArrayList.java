import java.util.Scanner;
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<String> food = new ArrayList();
        food.add("pasta");
        food.add("sausage dumplings");
        food.add("doner");
        food.add("chicken tikka masala");
        food.add("manti");
        System.out.println("Length :" + food.size());
        System.out.println("We are getting " + food.get(2));
        food.remove(1);
        for (String s: food) {
            System.out.print(s + ", "); 
            
        if (food.contains("chicken tikka masala")){
            System.out.println("I love chicken!");

        }
        System.out.println(food.contains("chicken tikka massala"));

        food.addAll(food2);

        ArrayList<String> food2 = new ArrayList();
        food.add("sushi");
        food.add("french fries");
       
    }



    }

    public static void whyWeDontUseArrays(){
        String[] food = {"Pasta", "sausage dumplings", "doner", "chicken tikka masala"};

        Scanner sc = new Scanner (System.in);

        System.out.println("Taking suggestions for the party!");

        String newfood = sc.nextLine();

        String[] food2 = new String[food.length + 1];

        for (int i = 0; i < food.length; i++){
            food2[i] = food[i];

        }
        food2[food.length] = newfood;

        System.out.println("This is our platter!");

        for (String s: food2) {
            System.out.print(s + ", ");
        }

    }
}
