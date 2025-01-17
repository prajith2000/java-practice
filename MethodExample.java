public class MethodExample {
    // Method with parameters and a return type
    public int add(int a, int b) {
        int sum = a + b;
        return sum;  // Returning the sum
    }

    // Method without return value (void)
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        MethodExample example = new MethodExample();

        // Calling the method with parameters and using the returned value
        int result = example.add(5, 10);
        System.out.println("Sum: " + result);

        // Calling the void method
        example.displayMessage("Hello, Java Methods!");
    }
}
