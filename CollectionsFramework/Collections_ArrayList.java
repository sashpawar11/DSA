import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections_ArrayList {


    // Dynamic Sized Arrays - ArrayList. Good compared to the fixed-size default array Datastructure in Java.
    // 0-based indexing

    public static void main(String[] args) {

        ArrayList<String> sc = new ArrayList<>();
        sc.add("Saish");     // .add(element) --> To add elements
        sc.add("Pawar");
        sc.remove("Pawar");   // .remove --> Remove element.

        System.out.println(sc);

        ArrayList<Integer> x = new ArrayList<>();
        //or
        List<Integer> in = new ArrayList<>();

        in.add(1);
        in.add(4);
        in.add(5);
        in.add(21);

        in.add(2, 9);   // alternative method for .add(index,element) // will add 9 at index 2

        System.out.println(in);

        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(500);
        listTwo.add(23);
        listTwo.add(59);
        listTwo.add(9);

        listTwo.remove(Integer.valueOf(23));         // to remove element of the type of arraylist.s
        listTwo.remove(0);       //remove at index i;
        System.out.println(listTwo);

        // Adding current arraylist to another arraylist
        in.addAll(listTwo);        // .addAll adds entire elements from the list inside the parenthesis, to the list which it is called on
        System.out.println("After adding listTwo to in");
        System.out.println(in);

        // To get element at a specific position in a list
        // use .get
        System.out.println(in.get(3));

        // To update element at a position -- > .set(index, newvalue)
        in.set(4, 10);
        System.out.println("After updating element at 4th index: " + in);

        // To check if an element is present in the arraylist.
        System.out.println(in.contains(9));


        // --------------------------------------------------------------------------
        // Iterating in ArrayList

        // 1) Using For Loop

        for(int i=0; i< in.size(); i++)
        {
            System.out.println(in.get(i));
        }

        // 2) Using ForEach Loop

        for(Integer element : listTwo)
        {
            System.out.println(element);
        }

        //3) Using Iterator ( from collections)

        Iterator<Integer> it = in.iterator();
        while( it.hasNext())
        {
            System.out.println("Iterator " + it.next());
        }

    }
}
