import java.util.ArrayList;

public class stackAL {
    static class stack{
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data)
        {
            list.add(data);
        }

        public boolean isEmpty()
        {
            return list.size()==0;
        }

        public int pop()
        {
            if(isEmpty())
            {
                return -1;
            }

            int top=list.remove( list.size()-1);
            return top;
        }   

        public int peek()
        {
            if(isEmpty())
            {
                return -1;
            }

            return list.get(list.size()-1);
        }
    }
    public static void main(String args[])
    {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
