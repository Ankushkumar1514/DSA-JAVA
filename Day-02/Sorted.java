public class Sorted {

    public static void main(String[] args) {
        
        int arr[] = {1,12,11,120};
        
        boolean Sorted = isSorted(arr);
        if(Sorted)
        {
            System.err.println("array is sorted!");
        }
        else
        {
            System.err.println("array is not sorted!");
        }
    }
    public static boolean isSorted(int arr[])
    {
        boolean s = true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                s = false;
            }
        }
        return s;
    }

    
}
