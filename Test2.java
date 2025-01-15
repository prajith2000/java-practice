//multi dimensional array
public class Test2 {
    public static void main(String[] args) {
        // Declaration and Initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements
        System.out.println("Element at (0, 0): " + matrix[0][0]);
        System.out.println("Element at (1, 2): " + matrix[1][2]);

        // Looping through the 2D array
        System.out.println("All elements in the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
