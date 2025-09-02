import java.util.Scanner;

public class print_an_array_in_reverse {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=ob.nextInt();
        int a[]=new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++)
        {
            a[i]=ob.nextInt();
        }
        reverse(a, size-1);
        ob.close();
    }
    public static void reverse(int arr[],int index)
    {
         if(index<0)
         {
            return;
         }
          
         System.out.println(arr[index]);
         reverse(arr, index - 1);
        
    }
}
