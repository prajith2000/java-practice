//string buffer : Thread-safe (synchronized), meaning it is safe to use in a multi-threaded environment.
public class Test4 {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // Append operation
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert operation
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace operation
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // Delete operation
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // Reverse operation
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
