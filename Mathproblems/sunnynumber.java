package Mathproblems;

import java.util.Scanner;

public class sunnynumber {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        int upgradednumber=n+1;
        double squareroot=Math.sqrt(upgradednumber);
        if(squareroot==(int)squareroot)
        {
            System.out.println("sunny number");
        }
        else
        {
            System.out.println("not sunny number");
        }
        ob.close();
    }
}
