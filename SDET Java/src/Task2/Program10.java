package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter testcases: ");
		int t = sc.nextInt();

		while (t-- > 0) {
			System.out.println("enter array size: ");
			int arrsize = sc.nextInt();
			System.out.println("enter sub set size: ");
			int subsize = sc.nextInt();
			System.out.println("enter times element should be poped: ");
			int pop = sc.nextInt();
			System.out.println("enter array elements: ");
			int[] arr = new int[arrsize];
			for (int i = 0; i < arrsize; i++) {
				arr[i] = sc.nextInt();

			}
			Arrays.sort(arr);
			int[] resarr = new int[arrsize];
			int c = 0,es=0,res = 0;
			ArrayList<Integer> array_list = new ArrayList<Integer>(subsize);
			for (int i = 0; i < arrsize; i++) {
				for (int j = i + 1; j < arrsize; j++) {
					
					c++;
					if (c <= pop) {

						resarr[i] = arr[i];
						resarr[j] = arr[j];
						array_list.add(new Integer(resarr[i] + resarr[j]));
						

					}
				}
			}
			
			for (int i =0 ; i <array_list.size(); i++) {
				es= array_list.get(i);
				res=es-res;		
			}
			System.out.println("Amount which he needs to subtract to get the correct result is : "+res);
		}
		sc.close();
	}

}
