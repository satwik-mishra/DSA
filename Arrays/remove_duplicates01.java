public class remove_duplicates01 {
    public static void main(String[] args) {
        int a[]={1,1,2,2,2,3,3};
        int count=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[i-1])
            {
                count++;
            }
        }
        System.out.println("number of unique elements="+count);
        int b[]=new int[count];
        b[0]=a[0];
        int j=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[i-1])
            {
                b[j]=a[i];
                j++;
            }
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
