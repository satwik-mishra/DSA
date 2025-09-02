package TwoPointers;
public class leetcode167 {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=18;
        int first=0;
        int last=arr.length-1;
        while(first<=last)
        {
            int sum=arr[first]+arr[last];
            if(sum==target)
            {
                System.out.println("position is "+ (first+1) +" "+(last+1));
                break;
            }
            else if(sum<target)
            {
                first++;
            }
            else
            {
                 last--;
            }
        }
        }
}

