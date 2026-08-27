public class Ocurrence2 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 8, 2, 5, 9, 2};

        int a[] = findFirstAndLast(arr,5);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static int[] findFirstAndLast(int[] arr, int target)
    {
        int index[] = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
            {
                if(index[0] == -1) index[0] = i;

                index[1] = i;
            }
        }
        return index;
    }
    
}
