package Searching;

import java.util.Scanner;

public class secondlargest {
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
        int secondlargest=-1;
        for(int i=0;i<size;i++)
        {
            if(a[i]>largest)
            {
               secondlargest=largest;
               largest=a[i];
            }
            if(a[i]<largest && a[i]>secondlargest)
            {
                secondlargest=a[i];
                System.out.println(secondlargest);
            }
        }
        ob.close();
    }
}
