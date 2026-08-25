public class Smallest {
    
     public static void main(String args[])
   {
    int arr[] = {7,4,8,2,3};

    int sma = arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i] < sma) sma = arr[i];
    }
    
    System.out.print("smallest : "+ sma);

   }
}
