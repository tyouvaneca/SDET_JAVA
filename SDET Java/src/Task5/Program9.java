package Task5;

import java.util.Scanner;

public class Program9 {

	static int getMissingNo(int a[], int n) {
		int x1 = a[0];
		int x2 = 1;
		for (int i = 1; i < n; i++)
			x1 = x1 ^ a[i];
		for (int i = 2; i <= n + 1; i++)
			x2 = x2 ^ i;
		return (x1 ^ x2);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("enter array:");
		for (int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}
		int miss = getMissingNo(myArray, size);
		System.out.println("Missing Number is: " + miss);
		sc.close();
	}

}
