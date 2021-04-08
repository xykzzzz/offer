package aa;

import java.util.PriorityQueue;
import java.util.Stack;

public class offer5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                Integer x = stack1.pop();
                stack2.push(x);
            }
        }
            return stack2.pop();
    }
}
