package Searching;

import java.util.Scanner;

public class binarysearchalgo {
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
       System.out.println("enter the element to be found");
       int element=ob.nextInt();
       int li=0;
       int hi=size-1;
       while(li<=hi)
       {
        int mid=(li+hi)/2;
        if(a[mid]==element)
        {
            System.out.println("element found at index "+mid);
            break;
        }
        else if(element>a[mid])
        {
            li=mid+1;
        }
        else
        {
            hi=mid-1;
        }
       }
       ob.close();
    }
}
