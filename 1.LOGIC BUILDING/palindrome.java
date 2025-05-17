import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int n=ob.nextInt();
        int rev=0;
        int temp=n;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(temp==rev)
    {
        System.out.println("the number is palindrome");
    }
    else
    System.out.println("it is not palindrome");
    ob.close();
    }
}
