

package sortingalgorithms;

import algorithm.Sort;
import static java.lang.System.out;
/**
 *
 * @author michael
 */
public class SortingAlgorithms
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] test = { 9, 16, 17, 5, 3, 18, 14, 4, 14, 17 };
        
        out.println(Sort.toString(test) + "\n");
        
        Sort.bubbleUp(test, 2, test.length - 1);
        
        //Sort.swap(test, 1, 4);
        
        out.println(Sort.toString(test));
    }
    
}
/*
[9, 16, 17, 5, 3, 18, 14, 4, 14, 17]
[9, 16, 5, 3, 17, 14, 4, 14, 17, 18] 

[9, 16, 17, 5, 3, 17, 14, 4, 14, 18] 
*/