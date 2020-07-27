package Task4;

import java.util.Scanner;

public class Program1 {

	int MAX = 100;

	static boolean isIdentity(int mat[][], int N) {
		for (int row = 0; row < N; row++) {
			for (int col = 0; col < N; col++) {
				if (row == col && mat[row][col] != 1)
					return false;
				else if (row != col && mat[row][col] != 0)
					return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the no of Rows & Col: ");
		int rowscol = sc.nextInt();
		System.out.println("Enter Matrix Elements: ");
		int Matrix[][] = new int[rowscol][rowscol];
		for (int i = 0; i < rowscol; i++) {
			for (int j = 0; j < rowscol; j++) {
				Matrix[i][j] = sc.nextInt();
			}
		}

		if (isIdentity(Matrix, rowscol))
			System.out.println("Yes ");
		else
			System.out.println("No ");
		sc.close();
	}
}
