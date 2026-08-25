public class Largest {

   public static void main(String args[])
   {
    int arr[] = {7,4,8,21,3};

    int lar = arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i] > lar) lar = arr[i];
    }
    
    System.out.print("larget : "+ lar);

   }
}