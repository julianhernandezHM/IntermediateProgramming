public class Pie {
        double yumminess; 
        String type; // Pumpkin, pecan, etc. 
    
        Pie(double yumminess, String type) {
            this.yumminess = yumminess; 
            this.type = type;
        }


        public double getNumber(){
            return yumminess;
        }

        public String getType(){
            return type;

        }
    }
