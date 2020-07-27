package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of elements in array and no of queries");
		int arraysize = sc.nextInt();
		int query = sc.nextInt();

		int secondsmall = 0;
		
		int[] arr = new int[arraysize];
		int test[] = new int[query];
		
		System.out.println("enter array elements");
		for (int i = 0; i < arraysize; i++) {
			arr[i] = sc.nextInt();

		}
		
		System.out.println("enter K values");
		Arrays.sort(arr);
		for (int i = 0; i < query; i++) {
			test[i] = sc.nextInt();
		}
		
		System.out.println("the output is");
		for (int i = 0; i < query; i++) {
			for (int j = 0; j < arraysize; j++) {
				if (arr[j] < test[i]) {
					secondsmall = arr[j];
				}
			}
			System.out.println(secondsmall);
		}
		sc.close();
	}


}
