//stack implementation using collection frame work
import java.util.*;


public class stack_CL {
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(50);
        s.push(40);
        s.push(30);
        s.push(20);
        s.push(10);


        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
