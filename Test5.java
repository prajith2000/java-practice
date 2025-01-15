//string builder : no thread safe but faster it does not synchronize methods   
public class Test5{  
    public static void main(String[] args) {
        // Creating a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append operation
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert operation
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace operation
        sb.replace(5, 10, "Java");
        System.out.println("After replace: " + sb);

        // Delete operation
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // Reverse operation
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}


