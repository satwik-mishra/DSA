public class sumofNnaturalnos {
    public static void main(String[] args) {
        int result=sum(5);
        System.out.println(result);
    }
    public static int sum(int n)
    {
        if(n==0)
        {
           return 0;
        }
        int summed=sum(n-1);
       return n+summed;
    }
}
