import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
       int n=ob.nextInt(); int temp=n;
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            n=n/10;
            sum=sum+d;
        }
        System.out.println("sum of digits of the number "+ temp +" is "+sum);
        ob.close();
    }
}
