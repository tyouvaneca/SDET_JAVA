package Task2;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string :");
		String str = sc.nextLine();
		str = str.replaceAll("\\s", "");

		System.out.println(str);
		sc.close();

	}

	
}
