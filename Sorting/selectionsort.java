public class selectionsort {
    public static void main(String[] args) {
        int arr[]={49,74,25,36,88,18,31};
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        
        System.out.println("the sorted array is");
        for(int number : arr)
        {
            System.out.print(number+" ");
        }
    }
}

