package Task5;

import java.util.Scanner;

public class Program2 {

	public static void print2largest(int arr[], int arr_size) {
		int i, first, second;
		first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest" + " element\n");
		else
			System.out.print("The second largest element" + " is " + second);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int arraysize = sc.nextInt();
		int[] arr = new int[arraysize];
		System.out.println("enter array:");
		for (int i = 0; i < arraysize; i++) {
			arr[i] = sc.nextInt();

		}
		print2largest(arr, arraysize);
		sc.close();
	}
}
