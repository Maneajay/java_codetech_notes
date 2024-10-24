package collage;

import MATRIX.Matrix;
import MATRIX.MatrixAddition;
import MATRIX.MatrixMax;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
                int ch,n1,n2;
                BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

                System.out.println("\nEnter the Dimension of matrix(mXn)\nEnter m:");
                n1= Integer.parseInt(br.readLine());
                System.out.println("Enter n:");
                n2= Integer.parseInt(br.readLine());

		Matrix matrix1 = new Matrix(n1,n2);
		Matrix matrix2 = new Matrix(n1,n2);

		while(true)
		{
			System.out.println("\nWhich operation to perform:\n1.Enter and dispaly matrix\n2.Add matrix\n3.Max element in the matrix\n4.Exit\nEnter your choice:");
		        ch= Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
					System.out.println("\nEnter elements for matrix 1:");
                                        matrix1.acceptMatrix();

		                        System.out.println("\nMatrix 1:");
		                        matrix1.displayMatrix();

					break;

				case 2:
					System.out.println("\nEnter elements for matrix 1:");
                                        matrix1.acceptMatrix();

		                        System.out.println("\nMatrix 1:");
		                        matrix1.displayMatrix();

					System.out.println("\nEnter elements for matrix 2:");
                                        matrix2.acceptMatrix();

		                        System.out.println("\nMatrix 2:");
		                        matrix2.displayMatrix();
		                        
					int[][] additionResult = MatrixAddition.addMatrices(matrix1,matrix2);

		                        System.out.println("Addtion of matrices:");
		                        for(int[] row:additionResult)
	 	                        {
			                        for(int element:row)
			                        {
				                       System.out.print(element+" ");
			                        }
			                        System.out.println();
		                        }
					break;

				case 3:
					System.out.println("\nEnter elements for matrix 1:");
                                        matrix1.acceptMatrix();

		                        System.out.println("\nMatrix 1:");
		                        matrix1.displayMatrix();
\
					int maxElement = MatrixMax.findMax(matrix1);
		                        System.out.println("Maximum element in matrix1:"+maxElement);
					break;

				case 4:
					System.exit(0);
					break;

				default:
					System.out.println("Invalid choice");
			}
		}
	}
}

