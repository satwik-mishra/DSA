import java.util.Scanner;

public class coutingdigits {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.println("the number of digits are:" +count);
        ob.close();
        } 
}
