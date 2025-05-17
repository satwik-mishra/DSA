import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int n=ob.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
          fact=fact*i;
        }
        System.out.println("factorial of " + n + " is " + fact);
        ob.close();
    }
}
