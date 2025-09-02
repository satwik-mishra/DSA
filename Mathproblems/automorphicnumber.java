package Mathproblems;
import java.util.Scanner;

public class automorphicnumber {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        int square=n*n;
        int count=0;
        int number=n;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
       
        int newmod=(int)Math.pow(10, count);
        
         int last_two_digits=square%newmod;
         if(last_two_digits==number)
         {
           System.out.println("the number is automorphic");

         }
         else
         System.out.println("the number is not automorphic");
         ob.close();
        }
     }

