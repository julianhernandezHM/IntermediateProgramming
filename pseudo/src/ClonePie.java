import java.util.ArrayList;

public class ClonePie {
    public static void main(String[] args) throws Exception {
        ArrayList<Pie> pies = new ArrayList<>();
        pies.add(new Pie(10.0, "Apple")); //10.0
        pies.add(new Pie(9.5, "Rhubarb"));
        pies.add(new Pie(3.5, "Blueberry"));
        pies.add(new Pie(6.5, "Pecan")); //6.5
        pies.add(new Pie(8.0, "Pecan"));
        cloneYummiestPie(pies);
        // output [(10.0 "Apple"), (9.5, "Rhubarb"), ..., (10.0, "Appple")]
        
        // yummiestBestOrder(pies);
        /* if you do yummiestBestOrder instead of cloneYummiestPie, 
        you'll output [(10.0 "Apple"), (9.5, "Rhubarb"),
                (3.5, "Blueberry"), (10.0, "Appple"),
                (6.5, "Pecan"), (6.5, "Pecan")]
         */ 
        for (int i = 0; i <pies.size(); i++){
            System.out.println(pies.get(i).type);

        }
       
    }
        
    // inserting a copy of the yummiest pie at the end of the list 
    static void cloneYummiestPie(ArrayList<Pie> pies) {

        // write your pseudocode here!
        // give me 2 examples and their output. 

        // int pie_taste = 0;
        //for (int i < 0; i < pies.size() ----> need to get only array type (yumminess value), 
        //  if pie[i] > pie_tastes then pie_taste = Pie[i]. 
        //  if (pies.contains(10.0)){
        //      clone_pie = corresponding object in the array}
        // Then, pies.add(new Pie(clone_pie))
        // pies = [(10.0 "Apple"), (9.5, "Rhubarb"),(3.5, "Blueberry"), (10.0, "Appple"),(6.5, "Pecan"), (6.5, "Pecan"), (10.0, "Apple"]

        Pie pieIndex = pies.get(0);
        double pie_taste = pies.get(0).yumminess; //Pie.getNumber();

        for (int i = 0; i < pies.size(); i++){
            double yummyNumber = pies.get(i).yumminess;

            if (yummyNumber> pie_taste){
                pieIndex = pies.get(i);

            }
            
        }
        pies.add(pieIndex);
      
            
        }

 

    // inserting the cloned yummiest pie 
    // at an index so that its clone 
    // is evenly spaced away from it. 
    // hint: you can use add(int index, E element)
    static void yummiestBestOrder(ArrayList<Pie> pies) { 
        // write your pseudocode here! 
        // give me 2 examples and their output. 

        Pie pieIndex = pies.get(0);
        double pie_taste = pies.get(0).yumminess; //Pie.getNumber();

        for (int i = 0; i < pies.size(); i++){
            double yummyNumber = pies.get(i).yumminess;

            if (yummyNumber> pie_taste){
                pieIndex = pies.get(i);

            }
            
        }
        pies.add(pieIndex);

        int evenly_spaced =pies.size()/2;

        pies.splice(evenly_spaced, 0 ,pieIndex.type);

      
            
        }



    }


class Pie {
    double yumminess; 
    String type; // Pumpkin, pecan, etc. 

    Pie(double yumminess, String type) {
        this.yumminess = yumminess; 
        this.type = type;
    }

    public static double getNumber() {
        return 0;
    }
}