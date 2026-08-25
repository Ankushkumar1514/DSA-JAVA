public class Secondlar1 {
    public static void main(String args[])
    {
        int arr[] = {10,10,4,10};
        int result = secondLargest( arr);
        
        System.out.println("second largest is :"+result);
    }

    public static int secondLargest(int[] arr)
    {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        if(arr.length <=1)
        {
            System.out.println("second largest does not exist!!");
            return -1;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > largest)
            {
                second = largest;
                largest = arr[i];
            }
            else if(arr[i] > second && arr[i] < largest)
            {
                second = arr[i];
            }
        
        }

        if(second != Integer.MIN_VALUE )
        return second;
        else
            {
              
                System.out.println("second largest doesnot exist!!");
                return -1;
                
            }

    }
    
}
