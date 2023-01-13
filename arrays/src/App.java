public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        

          //  double alexios = 0.2;
          //  double james = -5.00;

        // Declaration
            // double[] array arrayOfGPAs;
        boolean[] truthArray;
        String[] strArray;

        // initialization
            // arrayOfGPAs = new double[13];
        double[] arrayOfGPAs = {0.2, -5.00, 4.00};
        truthArray = new boolean[13];
        strArray = new String[13];

        // Access
        System.out.println(arrayOfGPAs[0]); 
            //Prints 0

        System.out.println(truthArray[0]); 
            // prints false

        System.out.println(strArray[0]); 
            //prints null [no information is there]
              //  anything that is Capital [is a Class] print null 
        
        // Change
        strArray[0] = "2,00 trees are cut down each minute";
        System.out.println(strArray[0]); 

        // 'For Loop'

        for (int i = 0; i < 3; i++){
            System.out.println(arrayOfGPAs[i]);

        }
        // Better for loop [ interate through all of them ]
        for(double gpa: arrayOfGPAs){
            System.out.println(gpa);
        }


    }
}
