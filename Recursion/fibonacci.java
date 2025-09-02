public class fibonacci {
    public static void main(String[] args) {
        int result=fibo(10);
        System.out.println(result);
    }
    public static int fibo(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
