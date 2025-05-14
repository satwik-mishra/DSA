import java.util.*;
public class eveodd {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int n=ob.nextInt();
        if(n%2==0)
    {
        System.out.println("the number is even");
    }
    else
    {
        System.out.println("it is odd");
    }
    ob.close();
    }
}
