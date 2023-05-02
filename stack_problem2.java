//reverse the stack
import java.util.*;
public class stack_problem2 {
    public static void pushAtbottom(Stack<Integer> s, int data){
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int temp = s.pop();
        pushAtbottom(s, data);
        s.push(temp);
}

public static void reverse(Stack<Integer> s)
{
    if(s.isEmpty())
    {
        return;
    }

    int top = s.pop();
    reverse(s);
    pushAtbottom(s, top);
}
public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
   
    reverse(s);
    //pushAtbottom(s, 10);// after reverse add value
    while(!s.isEmpty())
    {
        System.out.println(s.peek());
        s.pop();
    }
}
}

