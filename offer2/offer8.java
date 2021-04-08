package aa;

public class offer8 {
    public int JumpFloor(int target) {
        if(target==0||target==1){
            return 1;
        }
        int a=1;
        int b=1;
        int c=0;
        for (int i = 2; i <=target ; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
