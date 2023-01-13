public class MinDiff {
   
    public static int minDiff(int array[], int array_size) 
        {
        // go thorugh each stone,
        // take absolute difference --- Math.abs()
        // find what difference is the least

        //initialize i and Adjacent stone
            int i, AdjacentStone;

        // find absolute value of the first diffrence 
            int min_diff = Math.abs(array[0] - array[1]); 

        // for every value less than the array_ size ..
            for (i = 0; i < array_size; i++)
            {
                // go through every adjacent stone
                for (AdjacentStone = i+1; AdjacentStone < array_size; AdjacentStone++){

                    // if the absolute difference of the AdjacentStone and the current value of i is greater than the current min_diff
                    if (Math.abs(array[AdjacentStone] - array[i])< min_diff)
                    // the min_diff equals the new absolute value
                        min_diff = Math.abs(array[AdjacentStone] - array[i]);
    
                }
                
            }
            // return the min_diff
            return min_diff;
        }
    public static void main(String[] args) throws Exception {

        
        int[] intArray1 = {1, 34, 4, 6, 14, 2};
        int array_size1 = intArray1.length;
        int ans1 = minDiff(intArray1, array_size1); 
        System.out.println("Min Diff of {1, 34, 4, 6, 14, 2 } is: " + ans1);

        int[] intArray2 = {23, 15, 46, 75, 6, 74, 100};
        int array_size2 = intArray2.length;
        int ans2 = minDiff(intArray2, array_size2); 
        System.out.println("Min Diff of {23, 15, 46, 75, 6, 74, 100 } is: " + ans2);


    }

}
