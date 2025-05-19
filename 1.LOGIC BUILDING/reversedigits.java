import java.util.Scanner;

public class reversedigits {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        int rev=0;
        while(n!=0)
        {
           int d=n%10;
           rev=rev*10+d;
           n=n/10;
        }
        System.out.println("reversed number is "+rev);
        ob.close();
    }
}
