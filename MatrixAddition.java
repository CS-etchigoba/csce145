//Everlast Chigoba
//9-30-24
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Welcome to the matrix adder program!");
		System.out.println("Please enter the length and width of the first matrix: ");
		
		int rows1 = k.nextInt();
		int columns1 = k.nextInt();

		int[][] matrix1 = new int[rows1][columns1];
		
		for(int i = 0; i < rows1; i++)
		{
			for(int j = 0; j < columns1; j++)
			{
				System.out.println("Enter value at index " + i + " " + j );
				matrix1[i][j] = k.nextInt();
			}
		}
		
		System.out.println("Please enter the length and width of the second matrix: ");
		int rows2 = k.nextInt();
		int columns2 = k.nextInt();
		//Check if dimensions match
		if(rows1 != rows2 || columns1 != columns2)
		{
			System.out.println("Invalid Dimensions. These cannot be added.");
			
		}
		int [][] matrix2 = new int[rows2][columns2];
		for(int i = 0; i < rows2; i++)
		{
			for(int j = 0; j < columns2; j++)
			{
				System.out.println("Enter value at index " + i + " " + j);
				matrix2[i][j] = k.nextInt();
			}
		}
		//Creates result matrix by adding two matrices 
		int[][] resultMatrix = new int[rows1][columns1];
		for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
		//Prints the first matrix
		for(int i = 0; i < rows1; i++)
		{
			for(int j = 0; j < columns1; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
            System.out.println();

		}
		//Prints the second matrix
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
            System.out.println();

        }
        //Prints the resulting matrix
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
	}

}
