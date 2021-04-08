package aa;

public class offer7 {
    //循环时间复杂度o(n) 空间复杂度o(1)
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int a=1;
        int b=1;
        int c=0;
        for (int i = 3; i <=n ; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    //递归时间复杂度2^n-1 空间复杂度log n(递归树树的高度)
    public int Fibonacci1(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return Fibonacci1(n-1)+Fibonacci1(n-2);
    }
}
