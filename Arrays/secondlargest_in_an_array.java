public class secondlargest_in_an_array {
    public static void main(String[] args) {
        int[] arr = {5, 12, 23, 7, 19, 45, 3};
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest)
            {
                slargest=arr[i];
            }
        }
        System.out.println("second largest number is "+slargest);
    }
}
