
package algorithm;

public class Sort
{
    public static void bubbleSort(int [] list)
    {
        Sort.bubbleSort(list, 0, list.length - 1);
    }
    
    /*
        Implement the BubbleSort algorithm.
        One as to specify a lower and an upper index.
        These range of the array is then sorted by the algorithm.
        The lower and the upper index have to be checked for validity.
    */
    public static void bubbleSort(int[] list, int leftIdx, int rightIdx)
            throws IllegalArgumentException
    {
        if (leftIdx < 0 || leftIdx > list.length - 1 
                || rightIdx < 0 || rightIdx > list.length - 1) 
        {
            throw new IllegalArgumentException("Left or right index invalid.");
        }
        
        for (int i = list.length; i > 1; i--) 
        {
            
            for (int j = leftIdx; j < rightIdx; j++) 
            {
                
                if (list[j] > list[j + 1]) 
                {
                    int tmp = list[j];
                    
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
                
            }
        }
    }
    
    // The largest element within the specified array-range
    // has to be moved to position i.
    // Basically just the inner loop of BubbleSort.
    // Parameter validity checks required.
    public static void bubbleUp(int[] list, int leftIdx, int i)
    {
        if (leftIdx < 0 || leftIdx > list.length - 1 
                || i < 0 || i > list.length - 1) 
        {
            throw new IllegalArgumentException("Left or right index invalid.");
        }
        
        while (leftIdx < i) 
        {                
            if (list[leftIdx] > list[leftIdx + 1]) 
            {
                int tmp = list[leftIdx];

                list[leftIdx] = list[leftIdx + 1];
                list[leftIdx + 1] = tmp;
            }
            
            leftIdx++;
        }
    }
    
    public static void quickSort(int[] list)
    {
        Sort.quickSort(list, 0, list.length);
    }
    
    // Validate leftIndex and rightIndex concerning being within the
    //  array range.
    
    public static void quickSort(int[] list, int leftIdx, int rightIdx)
    {
        if (leftIdx < 0 || leftIdx > list.length - 1 
                || rightIdx < 0 || rightIdx > list.length - 1) 
        {
            throw new IllegalArgumentException("Left or right index invalid.");
        }
        
        int index = divide(list, leftIdx, rightIdx);
        
        if (leftIdx < index - 1) 
        {
            quickSort(list, leftIdx, index - 1);
        }
        
        if (index < rightIdx) 
        {
            quickSort(list, index + 1, rightIdx);
        }
    }
    
    public static int divide(int [] list, int leftIdx, int rightIdx)
    {
        if (leftIdx < 0 || leftIdx > list.length - 1 
                || rightIdx < 0 || rightIdx > list.length - 1) 
        {
            throw new IllegalArgumentException("Left or right index invalid.");
        }
        
        int pivotItem = list[rightIdx];
        int i = leftIdx;
        int j = rightIdx - 1;
        
        while (i <= j) 
        {
            while (list[i] < pivotItem)
            {
                i++;
            }
            
            while (list[j] >= pivotItem) 
            {
                j--;
            }
            // As long as leftIdx have not overstep rightIdx ...
            if (i <= j) 
            {
                int tmp = list[i];
                
                list[i] = list[j];
                list[j] = tmp;
                
                i++;
                j--;
            }
        }
        
        int tmp = list[j + 1];
        list[j + 1] = pivotItem;
        list[rightIdx] = tmp;
        
        return j + 1;
    }
    
    // Exchange the array-elements i and j.
    // Parameter validity checks required.
    public static void swap(int[] list, int i, int j)
    {
        if (i < 0 || i > list.length - 1 
                || j < 0 || j > list.length - 1) 
        {
            throw new IllegalArgumentException("Left or right index invalid.");
        }
        
        int tmp = list[i];
        
        list[i] = list[j];
        list[j] = tmp;
    }
    
    // Convert the array to a appropriate String representation!
    // Parameter validity checks required.
    public static String toString(int [] list, int start, int end)
    {
        if (start < 0 || start > list.length - 1 
                || end < 0 || end > list.length - 1
                || start > end) 
        {
            throw new IllegalArgumentException("Left or right index invalid.");
        }
        
        String ret = "";
        
        for (int i = start; i <= end; i++) 
        {
            ret += list[i] + ", ";
        }
        
        return "[ " + ret.substring(0, ret.length() - 2) + " ]";
    }
    
    public static String toString(int [] list)
    {
        return Sort.toString(list, 0, list.length - 1);
    }
}
