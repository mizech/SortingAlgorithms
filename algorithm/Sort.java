
package algorithm;

public class Sort
{
    public static void bubbleSort(int [] list)
    {
        Sort.bubbleSort(list, 0, list.length - 1);
    }
    
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
    
    public static void quickSort(int [] list)
    {
        
    }
    
    public static void quickSort(int [] list, int leftIdx, int rightIdx)
    {
        
    }
    
    public static int divide(int [] list, int leftIdx, int rightIdx)
    {
        return 1;
    }
    
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
            ret += list[i] + "\n";
        }
        
        return ret.substring(0, ret.length() - 1);
    }
    
    public static String toString(int [] list)
    {
        return Sort.toString(list, 0, list.length - 1);
    }
}
