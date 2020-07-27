package Task4;

import java.util.Scanner;

public class Program9 {

	public static String lrs(String s, String t) {
		int n = Math.min(s.length(), t.length());
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				return s.substring(0, i);
			}
		}
		return s.substring(0, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string :");
		String str = sc.next();
		String result = "";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String x = lrs(str.substring(i, n), str.substring(j, n));
				if (x.length() > result.length())
					result = x;
			}
		}
		System.out.println("Longest repeating sequence: " + result);
		sc.close();
	}

}
