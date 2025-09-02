public class check_if_sorted {
    public static void main(String[] args) {
      int[] a = {12, 5, 30, 2, 18, 9, 21};
      int flag=0;
      for(int i=1;i<a.length;i++)
      {
        if(a[i]<=a[i-1])
        {
          flag=1;
          break;
        }
       
      }
      if(flag==0)
      {
        System.out.println("array is sorted");
      }
      else
      System.out.println("array is not sorted");
    }
}
