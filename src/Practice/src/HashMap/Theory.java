package HashMap;

public class Theory {

    /*
    •	Set is an unorder of elements.
•	A
•	Iterator <> if = fruit.iterator();
•	While ( if.hasNext())
•	{
•	SOUT(if.next ()),
•	If(if==”apple”),
•	If remove ()
•	},

	The collection is used when we wish to avoid the duplication of the objects and wish to store only the unique objects.
	A set interface is implemented by various sub classes like – linked set, HashSet & Tree Set, and etc.


	Bucket: where the data/objects is stored.

	HashSet: it is a collection class that stores unique elements using the hashing mechanism.
	It is part of java collection framework and internally back by hashMap.
	The HashSet class is an inherent implementation of hashtable data structure.
	The object that we inherit into the hashset do not garuntee to be inserted to the same order.
	The objects are inserted based on their hashcode.
	This class also allowed a null element.




	No specific order.
	Internal Working
	HashSet uses a HashMap internally to store it’s element.
	Act a key in the internal hashmap.
	With the dummy object of it’s value.







    HashSet in Java

    A HashSet is a collection that uses a hash table for storage. It implements the Set interface and does not allow duplicate elements. HashSet is part of the Java Collections Framework and is found in the java.util package.
    Features of HashSet:
            1. No Duplicates: HashSet does not allow duplicate elements. If you try to add a duplicate element, the add() method will return false.
            2. Unordered: The elements in a HashSet are not ordered. The order of elements
    may change over time as elements are added or removed.
            3. Allows Null: HashSet allows the inclusion of a null element.
4. Fast Operations: HashSet provides constant time performance for basic operations like add, remove, and contains, assuming the hash function disperses elements properly.

    Example of HashSet in Java:
            import java.util.HashSet;
    public class HashSetExample {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();

            // Adding elements to the HashSet
            set.add("Apple");
            set.add("Banana");
            set.add("Orange");
            set.add("Apple"); // Duplicate element, will not be added

            // Displaying the HashSet
            System.out.println("HashSet: " + set);

            // Checking if an element exists
            System.out.println("Contains Banana? " + set.contains("Banana"));

            // Removing an element
            set.remove("Orange");
            System.out.println("After removing Orange: " + set);
        }
    }



    HashSet in java:                       Array                Sorted Array          Binary Search Tree
    Insert Add - O(1)                     O(1)                   O(n)                      O(h) O(n)
    Search Contains - O(1)                O(n)                   O(log n)                  O(h) O(n) O(log n)
    Delete Remove - O(1)                  O(n)                   O(n)                      O(h) O(n)



# Java Program to demonstrate the working of a HashSet

import java.util.*;

    public class HashSetDemo{
        public static void main(String args[]){
            // Creating a HashSet
            HashSet<String> set = new HashSet<String>();

            // Adding elements to the HashSet
            set.add("Apple");
            set.add("Banana");
            set.add("Orange");
            set.add("Grapes");
            set.add("Apple"); // Duplicate element, will not be added

            // Displaying the HashSet
            System.out.println("HashSet: " + set);

            // Checking if an element exists
            System.out.println("Contains Banana? " + set.contains("Banana"));

            // Removing an element
            set.remove("Orange");
            System.out.println("After removing Orange: " + set);
        }

    }

#HashSet

    Features                            Description
    Internal Structure                  Hash table (backed by a HashMap)
    Stores                              Only Keys (values are dummy constants)
    Duplicates                          Not allowed (based on hashCode() + equals())
    Null Elements                       Allowed (only one null element)
    Order                               Undored (no guaranteed order of elements)
    Thread - safe                       No (use Collections.synchronizedSet() for thread safety)
    Performance                        O(1) for add, remove, contains (average case)






    Concept                                     Description
    Hashing                                   Converts data to an integer (hash code) for quick lookup
    HashSet                                   Stores unique elements using hashMap internally
    Uniqueness                                Ensured by hashCode() and equals() methods
    Order                                     Unordered collection
    Speed                                    Fast operations (average O(1) time complexity)*/

}
