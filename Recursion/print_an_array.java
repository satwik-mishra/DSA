import java.util.Scanner;

public class print_an_array {
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
        printarray(a, 0);
        
        ob.close();
    }
        public static void printarray(int arr[],int index)
        {
            if(index==arr.length)
            {
                return;
            }
            System.out.println(arr[index]);
            printarray(arr, index+1);
        }
}

