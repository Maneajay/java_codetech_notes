package MATRIX;
import java.util.Scanner;

public class MatrixOperations({
    private int[][] matrix;
    private int rows, cols;

    // Constructor to initialize matrix with given dimensions
    public MatrixOperations(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    // Method to accept matrix elements from the user
    public void acceptMatrix(Scanner scanner) {
        System.out.println("Enter elements for a " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to display the matrix
    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to add two matrices element-wise
    public static MatrixOperations addMatrices(MatrixOperations m1, MatrixOperations m2) {
        if (m1.rows != m2.rows || m1.cols != m2.cols) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return null;
        }

        MatrixOperations result = new MatrixOperations(m1.rows, m1.cols);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.cols; j++) {
                result.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
            }
        }
        return result;
    }

    // Method to find the maximum element in the matrix
    public int findMaxElement() {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}

