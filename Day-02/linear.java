public class linear {
    public static void main(String[] args) {
        
        int arr [] = {0,0,1,2,1,0,1,4,0};
        int ele = 4;
        int index = linearSearch(arr,ele);
        if(index == -1) 
        {
            System.out.println("element is not found!!");
        }
        else
        {
            System.out.println("element si found at: "+index);
        }

    }

    public static int linearSearch(int arr[],int ele)
    {
        for (int i = 0; i < arr.length; i++) {

            if(ele == arr[i])
                return i;

        }
        return -1;
    }
    
}
