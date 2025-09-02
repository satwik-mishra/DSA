package Mathproblems ;

import java.util.Scanner;

public class petersonnumber
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
      
        int original_number=n;
        
        int sumoffact=0;
     
       
        while(original_number!=0)
        {
          int d=original_number%10;
            int fact=1;
            for(int i=1;i<=d;i++)
            {
               fact=fact*i;
            }
            sumoffact=sumoffact+fact;
            original_number=original_number/10;
        }
        if(sumoffact==n)
        {
            System.out.println("peterson number");
        }
        else
        {
            System.out.println("not a peterson number");
        }
        ob.close();
    }  
}
