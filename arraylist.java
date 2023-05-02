
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String args[])
    {
        ArrayList<Integer> list =new ArrayList<>();
        //ArrayList<String> list2 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(5);
        System.out.println("element in list : "+list);

        int get= list.get(2);
        System.out.println("Index value known : "+get);

        int size = list.size();
        System.out.println("Size of the arraylist is : "+size);

        list.remove(2);
        System.out.println("After removing elements are : "+list);

        list.add(2,30);
        System.out.println("add value in index 2 : "+list);

        list.set(2, 0);
        System.out.println("change value in index 2 position: "+list);


        for(int i =0;i<list.size();i++)
        {
            
            System.out.println(list.get(i));
        }
        System.out.println();


        //sort using collection
        Collections.sort(list);
        System.out.println("sort using collections: "+list);

    }
}
