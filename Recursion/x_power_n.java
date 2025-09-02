public class x_power_n {
    public static void main(String[] args) {
    int result=power(2, 4);
    System.out.println(result);
    }
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int powervalue=power(x,n-1);
        return x*powervalue;
    } 
    
}
