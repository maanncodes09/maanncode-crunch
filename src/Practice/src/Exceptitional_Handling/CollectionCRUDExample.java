package Exceptitional_Handling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionCRUDExample {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList();
        // Add Elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");

        // Access elements

        System.out.println("Fruits: at index #2 "+fruits.get(2));

        //modify elements
        fruits.set(2, "Grapes");
        System.out.println("Fruits: at index #2 "+fruits.get(2));

        //Insert Element
        fruits.add("1,Kiwi");
        System.out.println("After Insertion: "+fruits);

        //Remove
        fruits.remove("Orange");
        System.out.println("After Removal: "+fruits);

        //check if element available
        System.out.println("Is Mango available? "+fruits.contains("Mango"));

        // Get Size
        System.out.println("The size of given collection is "+fruits.size());

        // Sort ArrayList
        Collections.sort(fruits);
        System.out.println("The sorted collection is "+fruits);

        //Iterate in ArrayList -1
        for(String str : fruits){
            System.out.println("Fruits: "+str);
        }

        // Iterate in ArrayList -2 (Using Iterator/iterator method)
        Iterator<String> itreatorObject = fruits.iterator();
        while(itreatorObject.hasNext()){
            System.out.println("Fruits: "+itreatorObject.next());
        }

        // Clear all Elements from List
        fruits.clear();
        System.out.println("After clear operation: "+fruits);

        //checking if  empty
        System.out.println("Is fruits list empty? "+fruits.isEmpty());


    }

}





//  #LinkedList
/*
* --> Linked list  is a linear data structure that stores a sequence of elements called nodes which are linked together by pointers.
*
* --> In linked  list each node contains data and the reference address of  next  and previous notes.
*        [ 5 | 9 | 2 | 4 ]-->ArrayList
*          0   1   2   3
* LinkedList:
*  Null<--- [|5|]--><--- [|9|]--><--[|2|]--><--[|4|]--->Null
*            1011         1129       2312       1105
*
* --> Linked list maintain the insertion order, it allows duplicate elements to be stored.
* --> Linked list is prefered over arraylist for the insertion and delition(No shifting like arrays).
* --> In LinkedList each node is stored in separately in memory(not-contiguous).
* -->  List alterator
*
* #SINGLE LinkedList:
* #DOUBLE LinkedList:
*
*
*
* */






