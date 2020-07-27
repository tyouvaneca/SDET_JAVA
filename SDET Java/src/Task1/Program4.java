package Task1;

import java.util.Scanner;

public class Program4 {

	public static void main(String args[]) 
	{ 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter testcases: ");
		int t = sc.nextInt();
		int a = 0, b = 0;
		if (t >= 1 && t <= 100) {
			System.out.println("enter positive numbers: ");
			while (t-- > 0) {

				a = sc.nextInt();
				b = sc.nextInt();
				if ((a >= 1 && a <= 106) && (b >= 1 && b <= 106)) {
					a = a + b;
					b = a - b;
					a = a - b;
					System.out.println(a + " " + b);
				}
			}
		}
		sc.close();
	}

}

