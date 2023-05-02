//singly linked list

public class LL_scratch {
    
    Node head;

    private int size;

    LL_scratch()
    {
        size = 0;
    }

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next= null;
            size++;
        }
    }
//insert value in first position
public void addFirst(String data)
{
    Node newNode = new Node(data);
    if(head == null)
    {
        head = newNode;
        return;
    }
    newNode.next=head;
    head=newNode;

}
//insert value in the last position

public void addLast(String data)
{
    Node newNode = new Node(data);
    if(head == null)
    {
        head = newNode;
        return;
    }

    Node lastNode = head;
       while(lastNode.next != null) {
           lastNode = lastNode.next;
       }


       lastNode.next = newNode;
   }
// remove or delete from first position
public void removeFirst()
{
    if(head == null)
    {
       System.out.println("empty list");
       return;
    }
    head = this.head.next;
    size --;
}

//remove from the last element
public void removeLast()
{
    if(head == null)
    {
       System.out.println("empty list");
       return;
    }
    size--;

    if(head.next == null) {
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
//insert in middile posiition

public void addInMiddle(int index, String data)
{
    if(index>size||index<0)
    {
        System.out.println("invalid");
        return;
    }
    size--;
    Node newNode = new Node(data);
    if(head==null||index==0)
    {
        newNode.next=head;
        head=newNode;
        return;
    }
    Node currNode=head;
    for(int i=1;i<size;i++)
    {
        if(i==index)
        {
            Node nextNode = currNode.next;
            currNode.next = newNode;
            newNode.next=nextNode;
            break;
        }
        currNode=currNode.next;
    }

}

//print values
public void printlist(){
    if(head == null)
    {
       System.out.println("empty list");
    }

    Node currNode=head;
    while(currNode!=null)
    {
        System.out.print(currNode.data+"-->");
        currNode=currNode.next;
    }
    System.out.println("null");
}

public int getsize()
{
    return size;
}

//main method
public static void main(String[] args)
{
    // insert number and print

    LL_scratch list = new LL_scratch();
    list.addFirst("Sayani");
    list.addFirst("AM");
    list.addFirst("I");
    System.out.println(list.getsize());
    list.printlist();
    list.addLast("Ghatak");
    System.out.println(list.getsize());
    list.printlist();
    list.removeFirst();
    list.printlist();
    System.out.println(list.getsize());
    list.removeLast();
    list.printlist();
    System.out.println(list.getsize());
    list.addInMiddle(1, "sgp");
    list.printlist();
}
}
