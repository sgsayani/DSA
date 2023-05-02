//doubly linked list

public class DLL {
   // Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
Node head = null;
Node trail = null;
//insert value in first position
public void addFirst(int data)
{
    Node newNode = new Node(data);
    if(head==null)
    {
        head = newNode;
        trail = newNode;
    }
    else{
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

}
//insert value in last position.
public void addLast(int data)
{
    Node newNode = new Node(data);
    if(head==null)
    {
        head = newNode;
        trail = newNode;
    }
    Node lastNode = head;
       while(lastNode.next != null) 
       {
           lastNode = lastNode.next;
       }
       lastNode.next = newNode;
}
//remove element from first and delete
public void remove1st()
{
    if(head == null)
    {
        System.out.println("empty");
        return;
    }
    head = this.head.next;
}

//remove from the last element
public void removeLast()
{
    if(head == null)
    {
        System.out.println("empty list");
        return;
    }
    if(head.next == null)
    {
        head = null;
        return;
    }
    Node currNode = head;
    Node lastNode = head.next;

    while(lastNode.next != null)
    {
        currNode = currNode.next;
        lastNode = lastNode.next;
    }


    currNode.next = null;
}



//print the linkedlist
public void printlist()
{
    if(head == null)
    {
        System.out.print("empty list");
    }
    Node currNode = head;
    while(currNode!=null)
    {
        System.out.print(currNode.data +"-->");
        currNode = currNode.next;
    }
    System.out.println("null");
}
//main method
public static void main(String[] args)
{
    DLL list = new DLL();//object
    //taking data and print 
    list.addFirst(10);
    list.addFirst(20);
    list.addFirst(30);
    list.printlist();
    list.addLast(40);
    list.printlist();
    list.remove1st();//remove 1st element
    list.printlist();
    list.removeLast();
    list.printlist();

}
}
