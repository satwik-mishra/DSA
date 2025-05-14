import java.util.Scanner;

public class sumofnaturalnos {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        int s=(n*(n+1))/2;
        System.out.println("the sum of natural numbers upto n is "+s);
        ob.close();

    }
}
