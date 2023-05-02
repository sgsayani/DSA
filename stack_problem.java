import java.util.*;
//enter element in last of the stack


public class stack_problem{
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


public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    pushAtbottom(s, 10);

    while(!s.isEmpty())
    {
        System.out.println(s.peek());
        s.pop();
    }
}
}