
import java.util.*;
class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;

    public MyStack(){
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    public void push(int x){
        q1.offer(x);
        top=x;
    }
    public int pop(){
        while(q1.size()>1){
            int val = q1.poll();
            q2.offer(val);
        }
        int last = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return last;
    }
    public int top(){
        return top;
    }
    public boolean empty(){
        q1.isEmpty();
    }
}
