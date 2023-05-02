
public class stack_LL {
   private static class Node{// create node
        int data;
        Node next;

        Node(int data)// constructor
        {
            this.data= data;
            next = null;
        }
    }

    static class Stack{//create stack class

        public static Node head =null; // create head for linkedlist
       

        public static void  push(int data)// doing push operation. means enter values
        {
            Node newNode = new Node(data);// create new node
            if(head == null)// if head of the stack is null then value of head will be newnode's value.
            {
                head = newNode;
                return ;
            }
            newNode.next=head;//if head is not null then valie of the new node willbe value of head.
            head= newNode;// head will be newnode
            
        }
        public static boolean isempty()// if stack is empty the simply return the null value of head.
        {
            return head == null;
        }
        public static int pop()// pop operation is happened. 
        {
            if(isempty())
            {
                return -1;
            }

            int top = head.data;// the value of head will enter in top
            head = head.next;// value of head willbe next of head.
            return top;//return the top value of the stack
        }


        public static int peek()// peek means it show the value of element present in top
        {
            if(isempty())
            {
                return -1;
            }

            Node top = head;// top value will be head value
            return top.data;
        }
    }

    


public static void main(String args[])
{
   Stack s = new Stack();
   s.push(1);
   s.push(2);
   s.push(3);
   s.push(4);
   s.push(5);
   s.push(6);


   while(!s.isempty())
   {
    System.out.println(s.peek());
    s.pop();
   }

}

}
