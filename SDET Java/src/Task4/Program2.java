package Task4;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {    
		Scanner sc = new Scanner(System.in);
		int m, n, row, col, sum = 0;
		System.out.println("Enter the no of Rows & Coloums: ");
		m = sc.nextInt();
		n = sc.nextInt();
		int[] row_arr = new int[m];
		int i, j;
		int[][] mat = new int[m][n];
		System.out.println("Enter Matrix Elements: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)
				mat[i][j] = sc.nextInt();
		}

		int z = 0;

		System.out.println("Sum of rows is ");
		for (row = 0; row < m; row++) {
			sum = 0;
			for (col = 0; col < n; col++) {
				sum += mat[row][col];
			}

			System.out.println(sum + " ");

			row_arr[z++] = sum;
		}

		System.out.println("Sum of columns is ");
		sum = 0;
		int y = 0;
		int[] col_arr = new int[n];
		for (i = 0; i < n; ++i) {
			sum = 0;
			for (j = 0; j < m; ++j) {
				sum = sum + mat[j][i];
			}
			System.out.print(sum + " ");

			col_arr[y++] = sum;

		}
		sc.close();
	}


}
