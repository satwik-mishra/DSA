package Matrix;

import java.util.Scanner;

public class addtwomatrices {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the rows of first matrix");
        int m=ob.nextInt();
        System.out.println("enter the coloumns of first matrix");
        int n=ob.nextInt();
        int a[][]=new int[m][n];
        System.out.println("enter the array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=ob.nextInt();
            }
        }
        
         int b[][]=new int[m][n];
        System.out.println("enter the second array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=ob.nextInt();
            }
        }
         int c[][]=new int[m][n];
        System.out.println("sum of the array elements of both arrays");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(c[i][j]);
            }
            System.out.println();
        }
ob.close();
    }
}
