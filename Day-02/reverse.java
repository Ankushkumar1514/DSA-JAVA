public class reverse {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,3,5,8};

        reverse(arr);

        
    }

    public static void swap(int arr[],int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void reverse(int[] arr)
    {
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr,i,arr.length-i-1);
        }
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]+" ");
        }
        return;
    }
    
}
