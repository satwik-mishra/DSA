package Searching;

import java.util.Scanner;

public class largest {
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
        int largest=a[0];
        for(int i=0;i<size;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }
            
        }
        System.out.println("largest element is "+largest);
        ob.close();
    }
}
