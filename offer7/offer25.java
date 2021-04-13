package aa;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class RandomListNode {
    int label;
   RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class offer25 {
    public RandomListNode Clone(RandomListNode pHead) {
        Map<RandomListNode,RandomListNode> newOldMap=new TreeMap<>(new Comparator<RandomListNode>(){
            @Override
            public int compare(RandomListNode o1, RandomListNode o2) {
                return o1.label-o2.label;
            }
        });
        RandomListNode newFakeNode=new RandomListNode(-1);
        RandomListNode tail=newFakeNode;
        RandomListNode current=pHead;
        while (current!=null){
            RandomListNode newNode=new RandomListNode(current.label);
            tail.next=newNode;
            tail=newNode;
            newOldMap.put(current,newNode);
            current=current.next;
        }
        RandomListNode oldCurrent=pHead;
        RandomListNode newCurrent=newFakeNode.next;
        while (oldCurrent!=null){
            RandomListNode oldRandom=oldCurrent.random;
            RandomListNode newRandom;
            if(oldRandom==null){
                newRandom=null;
            }else {
                newRandom=newOldMap.get(oldRandom);
            }
            newCurrent.random=newRandom;
            oldCurrent=oldCurrent.next;
            newCurrent=newCurrent.next;
        }
        return newFakeNode.next;
    }
}
