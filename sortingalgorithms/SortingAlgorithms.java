

package sortingalgorithms;

import algorithm.Sort;
import static java.lang.System.out;

public class SortingAlgorithms
{

    public static void main(String[] args)
    {
        /*
        
        [9, 16, 17, 5, 3, 18, 14, 4, 14, 17]
        [3, 4, 5, 9, 14, 14, 16, 17, 17, 18] 
        
        [3, 4, 5, 9, 14, 16, 14, 17, 17, 18]
        
        */
        
        int[] test = { 9, 16, 17, 5, 3, 18, 14, 4, 14, 17 };
        out.println("Before: " + Sort.toString(test) + "\n");
        
        Sort.quickSort(test, 0, 9);
        
        out.println("After: " + Sort.toString(test));
    }
    
}
/*
[9, 16, 17, 5, 3, 18, 14, 4, 14, 17]
[9, 16, 5, 3, 17, 14, 4, 14, 17, 18] 

[9, 16, 17, 5, 3, 17, 14, 4, 14, 18] 
*/