package Task5;

import java.util.Scanner;

public class Program4 {

	static void pairs_value(int inputArray[], int inputNumber) {
		System.out.println("Pairs of elements and their sum : ");

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == inputNumber) {
					System.out.println(inputArray[i] + " + " + inputArray[j] + " =  " + inputNumber);
				}
			}
		}
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
		System.out.println("enter sum of array:");
		int sum = sc.nextInt();
		pairs_value(arr, sum);
		
		sc.close();

	}
}
