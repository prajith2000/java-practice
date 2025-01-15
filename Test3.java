public class Test3 {
    public static void main(String[] args) {
        // String declaration and initialization
        String greeting = "Hello, Java!";

        // Accessing string methods
        System.out.println("Original String: " + greeting);
        System.out.println("Length: " + greeting.length());
        System.out.println("Character at index 1: " + greeting.charAt(1));
        System.out.println("Substring (0, 5): " + greeting.substring(0, 5));
        System.out.println("Lowercase: " + greeting.toLowerCase());
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Replaced String: " + greeting.replace('a', 'o'));

        // Comparing strings
        String anotherGreeting = "Hello, Java!";
        System.out.println("Equals 'Hello, Java!': " + greeting.equals(anotherGreeting));

        // Trimming whitespace
        String spacedString = "   Hello, Java!   ";
        System.out.println("Trimmed String: '" + spacedString.trim() + "'");
    }
}
