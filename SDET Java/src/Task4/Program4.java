package Task4;

public class Program4 {

	public static void main(String[] args) {

		int row1, col1, row2, col2;
		boolean flag = true;
		int a[][] = { { 1, 6, 3 }, { 1, 4, 6 }, {9, 5, 7 } };
		int b[][] = { { 1, 7, 3 }, { 8, 9, 6 }, { 8, 5, 7 } };
		row1 = a.length;
		col1 = a[0].length;
		row2 = b.length;
		col2 = b[0].length;
		if (row1 != row2 || col1 != col2) {
			System.out.println("Matrices are not equal");
		} else {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					if (a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}
			if (flag)
				System.out.println("Matrices are equal");
			else
				System.out.println("Matrices are not equal");
		}
	}
}
