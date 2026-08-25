public class unique {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,4,4,5,11};

        if(arr.length <= 1)
        {
            System.out.println("array:"+arr);
        }
        else
        {
            int i = Uni(arr);
            for (int j = 0; j < i; j++) 
            {
                System.out.print(arr[j]+" ");    
            }
        }
    }

    public static int Uni(int arr[])
    {
        int i = 0;
        int j = 1;
        while ( j < arr.length)
        {
            if(arr[i] == arr[j])
            {
                j++;
            }
            else
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]  = temp;
                j++;

            }
        }
        return i+1;
    }
    
}
