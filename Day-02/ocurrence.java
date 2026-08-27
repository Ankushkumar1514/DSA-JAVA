class ocurrence
{
    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 8, 2, 5, 9, 2};

        int count  = countOccurrences(arr,2);
        System.out.println("no.of element is:"+count);
    }

    public static int countOccurrences(int[] arr, int target)
    {   int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) count++;
        }
        return count;
    }
}