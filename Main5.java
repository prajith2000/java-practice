//Maps->HashMap
import java.util.HashMap;

public class Main5 {
    public static void main(String[] args) {
        // Creating a HashMap of String keys and Integer values
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Apple", 40);  // Updating the value for the key "Apple"

        // Printing the HashMap
        System.out.println("HashMap: " + map);

        // Accessing a value using its key
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // Removing a key-value pair
        map.remove("Banana");
        System.out.println("After removing 'Banana': " + map);

        // Checking if a key exists
        System.out.println("Contains key 'Orange'? " + map.containsKey("Orange"));

        // Checking if a value exists
        System.out.println("Contains value 20? " + map.containsValue(20));

        // Iterating over the HashMap
        System.out.println("Key-Value pairs:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
