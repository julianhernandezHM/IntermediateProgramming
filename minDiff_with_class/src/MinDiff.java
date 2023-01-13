public class MinDiff {
   

public static int minDiff(int[] stones){
    int smallest = Math.abs(stones[0] - stones [1]);
    for(int i = 0; i < stones.length - 1 ; i++){ //stones.length -

        int currentDiff = Math.abs(stones[i] - stones [i+1]);
        
        if (currentDiff < smallest); {
            smallest = currentDiff;

        }
     
    }
    return smallest;
}

public static void main(String[] args) throws Exception {

        
    int[] intArray1 = {1, 34, 4, 6, 14, 2};
    int ans1 = minDiff(intArray1); 
    System.out.println("Min Diff of {1, 34, 4, 6, 14, 2 } is: " + ans1);

    int[] intArray2 = {23, 15, 46, 75, 6, 74, 100};
    int ans2 = minDiff(intArray2); 
    System.out.println("Min Diff of {23, 15, 46, 75, 6, 74, 100 } is: " + ans2);
}

}
