package Task4;

import java.util.Scanner;

public class Program8 {

	static void transpose(int A[][], int B[][], int rows, int columns) {
		int i, j;
		for (i = 0; i < columns; i++)
			for (j = 0; j < rows; j++)
				B[i][j] = A[j][i];
	}

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println(" ENTER NO OF ROWS: ");
		final int rows = sc.nextInt();
		System.out.println("ENTER NO OF COLUMNS: ");
		final int columns = sc.nextInt();
		System.out.println("Enter Matrix Elements: ");
		int A[][] = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int B[][] = new int[columns][rows], i, j;

		transpose(A, B, rows, columns);

		System.out.println("Result matrix is");
		for (i = 0; i < columns; i++) {
			for (j = 0; j < rows; j++)
				System.out.print(B[i][j] + " ");
			System.out.println(" ");
		}
		sc.close();
	}

}
