package Task5;

import java.util.Scanner;

public class Program8 {

	static void pushZerosToEnd(int arr[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i];
		while (count < n)
			arr[count++] = 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("enter array:");
		for (int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}

		pushZerosToEnd(myArray, size);
		System.out.println("Array after pushing zeros to the back: ");
		for (int i = 0; i < size; i++)
			System.out.print(myArray[i] + " ");
		sc.close();
	}

}
