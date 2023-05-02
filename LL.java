//Collection formation for linked list


import java.util.*;

public class LL 
{
    

public static void main(String[] args)
{
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("a");//take values in first index
    System.out.println(list);
    list.addFirst("is");
    System.out.println(list);
    list.addFirst("This");
    System.out.println(list);
    list.addLast("Linkedlist");
    System.out.println(list);


    System.out.println(list.size());

    for(int i=0;i<list.size();i++)//print linked list
    {
        System.out.print("-->"+list.get(i));
    }

    System.out.println("-->"+"null");



    //delete

    list.remove(3);//del index 3
    System.out.println(list);


    list.removeFirst();
    System.out.println(list);

    list.removeLast();
    System.out.println(list);



}}