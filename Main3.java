//Sets->Hashset
import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        // Creating a HashSet of String type
        HashSet<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");  // Duplicate element

        // Printing the HashSet
        System.out.println("Fruits: " + fruits);

        // Checking if an element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Removing an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Checking the size of the HashSet
        System.out.println("Size of the HashSet: " + fruits.size());

        // Iterating over the HashSet
        System.out.println("Fruits list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
