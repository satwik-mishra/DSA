public class Largest_in_an_array_01 {
    public static void main(String[] args) {
    int[] arr = {5, 12, 23, 7, 19, 45, 3};
    int largest=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>largest)
        {
            largest=arr[i];
        }
    }
    System.out.println(largest);
    }
}
