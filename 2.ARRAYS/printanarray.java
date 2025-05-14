import java.util.Scanner;

public class printanarray {
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
        System.out.println("the array is");
         for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
        ob.close();
    }
}
