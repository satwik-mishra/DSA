import java.util.Scanner;

public class reverseanarray {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=ob.nextInt();
        int a[]=new int[n];
        
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
       {
         a[i]=ob.nextInt();
       }
        for(int i=0;i<n/2;i++)
        {
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
       
          
    System.out.println("reversed array is");
       for(int i=0;i<n;i++)
       {
        System.out.println(a[i]);
       }
       ob.close();
    }
}
