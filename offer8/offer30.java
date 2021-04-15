package aa;

public class offer30 {

    public static int FindGreatestSumOfSubArray(int[] array) {
        //定义一个dp数组目的是保存每个连续子数组中和的值
        //dp[i]表示前i个元素的连续子数组最大和
        int[] dp=new int[array.length];
        //定义一个初始状态值
        dp[0]=array[0];
        int ret=array[0];
        for (int i = 1; i <array.length ; i++) {
            //状态转移方程
            dp[i]=Math.max(array[i],array[i]+dp[i-1]);
            ret=Math.max(dp[i],ret);
        }
        return ret;
    }

}
