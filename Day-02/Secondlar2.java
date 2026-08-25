public class Secondlar2 {
     public static void main(String args[])
    {
        int arr[] = {5, 10, 8, 3};
        int result = secondLargest(arr);
        
        System.out.println("second largest is :"+result);
    }

    public static int secondLargest(int[] arr)
    {

        int largest = arr[0];
        int second = arr[arr.length-1] ;
        //boolean f_sec = false;
        
        int i;
        if(arr.length <=1)
        {
            System.out.println("second largest does not exist!!");
            return -1;
        }

        for(i=1;i<arr.length;i++)
        {
            
             if(largest < arr[i])
            {
                second = largest;
                largest = arr[i];
            }
            else if(largest > arr[i] && arr[i] > second)
            {
                second = arr[i];
            }
        
        }

        if(second != largest )
        return second;
        else
            {
              
                System.out.println("second largest doesnot exist!!");
                return -1;
                
            }

    }
    

    
}
