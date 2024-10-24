package MATRIX;

import MATRIX.MatrixOperations;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept dimensions for the matrices
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create and accept two matrices
        MatrixOperations matrix1 = new MatrixOperations(rows, cols);
        matrix1.acceptMatrix(scanner);

        MatrixOperations matrix2 = new MatrixOperations(rows, cols);
        matrix2.acceptMatrix(scanner);

        // Display the matrices
        System.out.println("First Matrix:");
        matrix1.displayMatrix();

        System.out.println("Second Matrix:");
        matrix2.displayMatrix();

        // Add the matrices and display the result
        MatrixOperations sumMatrix = MatrixOperations.addMatrices(matrix1, matrix2);
        if (sumMatrix != null) {
            System.out.println("Sum of the two matrices:");
            sumMatrix.displayMatrix();
        }

        // Find and print the maximum element from the first matrix
        int maxElement = matrix1.findMaxElement();
        System.out.println("Maximum element in the first matrix: " + maxElement);

        scanner.close();
    }
}
