package Day3.Collection;
//Collections:
//Java Collection means a single unit of objects.
// Java Collection framework provides many interfaces
// (Set, List, Queue, Deque) and classes (ArrayList, Vector
// , LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Traversing Lists and Custom Types
public class Main {
    public static void main(String args[])
    {
        // Creating a ArrayList
        List<String> myList = new ArrayList<String>();

        // Adding elements to the list
        // Custom inputs
        myList.add("Java");
        myList.add("Python");
        myList.add("C/C++");
        myList.add("PHP");

        // For loop for iterating over the List
        for (int i = 0; i < myList.size(); i++) {

            // Print all elements of List
            System.out.println(myList.get(i));
        }
        // Using enhanced for loop(for-each) for iteration
        for (String i : myList) {
            // Print all elements of ArrayList
            System.out.println(i);
        }
        // Iterator
        Iterator<String> it = myList.iterator();

        // Condition check for elements in List
        // using hasNext() method returning true till
        // there i single element in a List
        while (it.hasNext()) {

            // Print all elements of List
            System.out.println(it.next());
        }
        // Lambda expression printing all elements in a List
        myList.forEach(
                (temp) -> { System.out.println(temp); });
    }
}
