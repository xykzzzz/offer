package aa;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class offer29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(k>input.length){
            return arrayList;
        }
        Queue<Integer> p=new PriorityQueue<>();
        for (int i = 0; i < input.length; i++) {
            p.add(input[i]);
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(p.remove());
        }
        return arrayList;
    }
}
