package Task5;

import java.util.Scanner;

public class Program6 {

	public static boolean isBinaryNumber(int num) {
		if (num == 0 || num == 1 || num < 0) {
			return false;
		}
		while (num != 0) {
			if (num % 10 > 1) {
				return false;
			}
			num = num / 10;
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input:");
		int N = sc.nextInt();
		System.out.println(isBinaryNumber(N));
		sc.close();
	}
}
