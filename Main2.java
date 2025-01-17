import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        // Creating a LinkedList of String type
        LinkedList<String> cities = new LinkedList<>();

        // Adding elements to the LinkedList
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");

        // Printing the LinkedList
        System.out.println("Cities: " + cities);

        // Adding an element at the beginning
        cities.addFirst("San Francisco");
        System.out.println("After adding at the beginning: " + cities);

        // Adding an element at the end
        cities.addLast("Houston");
        System.out.println("After adding at the end: " + cities);

        // Removing an element from the beginning
        cities.removeFirst();
        System.out.println("After removing from the beginning: " + cities);

        // Removing an element from the end
        cities.removeLast();
        System.out.println("After removing from the end: " + cities);

        // Accessing elements
        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());

        // Iterating over the LinkedList
        System.out.println("Cities list:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
