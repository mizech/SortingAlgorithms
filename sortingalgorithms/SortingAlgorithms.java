

package sortingalgorithms;

import algorithm.Sort;
import static java.lang.System.out;

public class SortingAlgorithms
{

    public static void main(String[] args)
    {
        //int[] test = { 9, 16, 17, 5, 3, 18, 14, 4, 14, 17 };
        
        int[] test = {16, 17, 5, 3, 18, 14, 4, 14 };
        
        out.println(Sort.toString(test) + "\n");
        
        int result = Sort.divide(test, 0, test.length - 1);
        
        out.println(result);
        out.println(Sort.toString(test));
    }
    
}
/*
[9, 16, 17, 5, 3, 18, 14, 4, 14, 17]
[9, 16, 5, 3, 17, 14, 4, 14, 17, 18] 

[9, 16, 17, 5, 3, 17, 14, 4, 14, 18] 
*/