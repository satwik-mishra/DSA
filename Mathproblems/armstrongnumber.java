package Mathproblems;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
     Scanner ob=new Scanner(System.in);
     System.out.println("enter the number");
     int n=ob.nextInt();
      int originalnumber=n;

     
      int sum=0;
        while(n!=0)
        {
           int d=n%10;
           sum=sum+(d*d*d);
           n=n/10;
        }
        if(sum==originalnumber)
        {
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("not armstrong number");
        }
             ob.close();

     }
}


