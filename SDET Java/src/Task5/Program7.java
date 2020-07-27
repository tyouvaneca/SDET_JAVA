package Task5;

import java.util.Scanner;

public class Program7 {

	static boolean areRotations(String str1, String str2) {
		return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string1: ");
		String str1 = sc.next();

		System.out.println("enter string2: ");
		String str2 = sc.next();

		if (areRotations(str1, str2))
			System.out.println("Strings are rotations of each other");
		else
			System.out.printf("Strings are not rotations of each other");
		sc.close();
	}
}
