package Task2;

import java.util.Scanner;

public class Program1 {

	public static void main(String args[])
	{
		int m, n, i, j;
		Scanner in = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter the number of rows and columns of first matrix");
		m = in.nextInt();
		n = in.nextInt();

		int a[][] = new int[m][n];
		int b[][] = new int[m][m];
		int c[][] = new int[m][n];
		System.out.println("Enter the elements of first matrix");

		for ( i = 0 ; i < m ; i++ )
			for ( j = 0 ; j < n ; j++ )
				a[i][j] = in.nextInt();

		System.out.println("Enter the number of rows and columns of second matrix");
		m = in.nextInt();
		n = in.nextInt();
		System.out.println("Enter the elements of second matrix");

		for ( i = 0 ; i < m ; i++ )
		{
			for ( j = 0 ; j < n ; j++ )
			{
				b[i][j] = in.nextInt();
			}
		}
		for ( i = 0 ; i < m ; i++ )
		{
			for ( j = 0 ; j < n ; j++ ) 
			{ 
				c[i][j]= a[i][j]+b[i][j]; //Adding two matrices
			}
		} 
		System.out.println("After addition of the two matrices:-");

		for ( i = 0 ; i < m ; i++ )
		{
			for ( j = 0 ; j < n ; j++ )
				System.out.print(c[i][j]+"\t");

			System.out.print("\n");
		}
	}
}
