public class printdecreasing {
    public static void main(String[] args) {
        decreasing(5);
    }
    public static void decreasing(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decreasing(n-1);

    }
}
