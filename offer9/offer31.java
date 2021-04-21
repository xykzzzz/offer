package aa;

public class offer31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        for (int i = 1; i <=n ; i++) {
            count+=search(i);
        }
        return count;
    }

    private int search(int i) {
        int count=0;
        String s=i+"";
        char[] chars = s.toCharArray();
        for (char c:chars) {
            if(c=='1'){
                count++;
            }
        }
        return count;
    }
}
