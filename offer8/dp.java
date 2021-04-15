package aa;

public class dp {
    public int maxsumofSubarray(int[] arr) {
        // write code here
        if (arr.length == 0) {
            return 0;
        }
        int sum=arr[0];
        int max=sum;
        for (int i = 1; i <arr.length ; i++) {
            sum=sum+arr[i];
            if(sum<arr[i]){
                sum=arr[i];
            }
            max=Math.max(max,sum);
        }
        return max;
    }


}
