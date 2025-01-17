//Maps->Treeset
import java.util.TreeSet;

public class Main6 {
    public static void main(String[] args) {
        // Creating a TreeSet of String type
        TreeSet<String> countries = new TreeSet<>();

        // Adding elements to the TreeSet
        countries.add("India");
        countries.add("USA");
        countries.add("Australia");
        countries.add("Germany");
        countries.add("India");  // Duplicate element, won't be added

        // Printing the TreeSet
        System.out.println("TreeSet: " + countries);

        // Accessing the first and last elements
        System.out.println("First country: " + countries.first());
        System.out.println("Last country: " + countries.last());

        // Checking if an element exists
        System.out.println("Contains 'India'? " + countries.contains("India"));

        // Removing an element
        countries.remove("Germany");
        System.out.println("After removing 'Germany': " + countries);

        // Iterating over the TreeSet
        System.out.println("Countries in TreeSet:");
        for (String country : countries) {
            System.out.println(country);
        }

        // Navigating the TreeSet
        System.out.println("Lower than 'India': " + countries.lower("India"));
        System.out.println("Higher than 'India': " + countries.higher("India"));
    }
}
