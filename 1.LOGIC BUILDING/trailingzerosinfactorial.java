import java.util.Scanner;

public class trailingzerosinfactorial {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        int count=0;
        for(int i=1;i<=fact;i++)
        {
          long d=fact%10;
          fact=fact/10;
          if(d==0)
          {
            count++;
          }
        }
        System.out.println("there are "+count+" number of zeros in factorial of "+n);
        
        ob.close();
    }
}
