//List-> Arraylist
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        // Creating an ArrayList of String type
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Printing the ArrayList
        System.out.println("Fruits: " + fruits);

        // Accessing an element
        System.out.println("First fruit: " + fruits.get(0));  // Output: Apple

        // Modifying an element
        fruits.set(1, "Grapes");
        System.out.println("After modification: " + fruits);

        // Removing an element
        fruits.remove(2);  // Removes "Orange"
        System.out.println("After removal: " + fruits);

        // Checking the size of the ArrayList
        System.out.println("Size of the ArrayList: " + fruits.size());

        // Iterating over the ArrayList
        System.out.println("Fruits list:");
        for (String fruit : fruits) {
            System.out.println(fruit);ff
        }
    }
}
