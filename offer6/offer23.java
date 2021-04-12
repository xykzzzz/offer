package aa;

public class offer23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        return bst(sequence,0,sequence.length-1);
    }

    private boolean bst(int[] sequence, int left, int right) {
        if(left>=right){
            return true;
        }
        int index=left;
        while (sequence[index]<sequence[right]){
            index++;
        }
        int midIndex=index;
        while (sequence[index]>sequence[right]){
            index++;
        }
        return index==right&&bst(sequence,left,midIndex-1)&&bst(sequence,midIndex,right-1);
    }
}
