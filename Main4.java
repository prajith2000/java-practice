//Sets->Treeset
import java.util.TreeSet;

public class Main4 {
    public static void main(String[] args) {
        // Creating a TreeSet of Integer type
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(10);  // Duplicate element

        // Printing the TreeSet
        System.out.println("Numbers: " + numbers);

        // Accessing the first and last elements
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // Removing an element
        numbers.remove(15);
        System.out.println("After removing 15: " + numbers);

        // Checking for an element
        System.out.println("Contains 10? " + numbers.contains(10));

        // Iterating over the TreeSet
        System.out.println("Numbers in TreeSet:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
