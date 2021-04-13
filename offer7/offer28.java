package aa;

import java.util.HashMap;
import java.util.Map;

public class offer28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i],(map.getOrDefault(array[i],0)+1));
        }
        for (int i = 0; i < array.length; i++) {
            if(map.get(array[i])>(array.length)/2){
                return array[i];
            }
        }
        return 0;
    }
}
