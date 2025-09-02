public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7, 2, 8, 4, 6};
        int length=arr.length;
        int temp;
        for(int i=1;i<length;i++)
        { boolean swapped=false;
            for(int j=0;j<length-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  swapped=true;
                }
            }
            if(swapped==false)
            {
                break;
            }
        }
        for(int number:arr)
        {
            System.out.println(number + " ");
        }

    }
}
