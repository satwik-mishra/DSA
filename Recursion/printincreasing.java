public class printincreasing {
    public static void main(String[] args) {
        increasing(1);
    }
    public static void increasing(int n)
    {
        if(n==5)
        {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        increasing(n+1);
    }
}
