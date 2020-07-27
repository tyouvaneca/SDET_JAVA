package Task5;

import java.util.Arrays;
import java.util.Scanner;

public class Program5 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("enter array:");
		for (int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}
		
		System.out.println("enter sum of array:");
		int reqSum = sc.nextInt();
		System.out.println("The array created is: " + Arrays.toString(myArray));
		System.out.println("sub arrays whose sum is: " + reqSum);
		for (int i = 0; i < myArray.length; i++) {
			int sum = 0;
			for (int j = i; j < myArray.length; j++) {
				sum = sum + myArray[j];
				if (sum == reqSum) {
					System.out.println(Arrays.toString(Arrays.copyOfRange(myArray, i, j + 1)));
				}
			}
		}
		sc.close();
	}
}
