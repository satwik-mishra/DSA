package Mathproblems;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
           if(n%i==0)
           {
            count++;
           }
        }
        if(count==2)
        {
            System.out.println(n+ " is prime");
        }
        else
        System.out.println(n+" is not prime");
        ob.close();
    }
}
