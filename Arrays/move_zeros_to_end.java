public class move_zeros_to_end {
    public static void main(String[] args) {
        int a[]={1,0,2,3,2,0,0,4,5,1};
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[j]=a[i];
                j++;
            }
        }
        for( int k=j;k<a.length;k++)
        {
            a[k]=0;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
