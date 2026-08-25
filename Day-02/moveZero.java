public class moveZero {

    public static void main(String[] args) {
        int arr [] = {0,0,1,2,1,0,1,4,0};
        

        moveZeroes(arr);

        for (int j = 0; j < arr.length; j++) 
            {
                System.out.print(arr[j]+" ");    
            }
        }

    public static void moveZeroes(int arr[])
    {
        int i = 0;
        int j = 0;

        while (j < arr.length)
        {
            if(arr[j] == 0)
            {
                j++;
            }    

            else
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]  = temp;
                i++;
                j++;

            }
        }
    }
}
