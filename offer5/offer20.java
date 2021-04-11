package aa;


import java.util.Deque;
import java.util.LinkedList;

public class offer20 {
    Deque<Integer> stack;
    Deque<Integer> min;
    public offer20(){
        stack=new LinkedList<>();
        min=new LinkedList<>();
    }
    public void push(int node) {
        stack.push(node);
        if(min.isEmpty()){
            min.push(node);
        }else {
            Integer pop = min.peek();
            if(pop>node){
                min.push(node);
            }else {
                min.push(pop);
            }
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }
}
