package aa;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class offer21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        List<Integer> pushList=arrToList(pushA);
        List<Integer> popList=arrToList(popA);
        Deque<Integer> stack=new LinkedList<>();
        while (!popList.isEmpty()){
            int r = popList.remove(0);
            while (true){
                if(stack.isEmpty()||stack.peek()!=r){
                    if(pushList.isEmpty()){
                        return false;
                    }
                    Integer t = pushList.remove(0);
                    stack.push(t);
                }else {
                    break;
                }
            }
            stack.pop();
        }
        return stack.isEmpty();
    }

    private List<Integer> arrToList(int[] a) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        return list;
    }
}
