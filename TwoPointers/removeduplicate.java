package TwoPointers;

public class removeduplicate {
    public static void main(String[] args) {
        int a[]={1,2,2,3,3,3,4};
        int unique=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[i-1])
            {
                a[unique]=a[i];
                unique++;
            }
        }
        for(int i=0;i<unique;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("number of unique elements is "+unique);
    }
}
