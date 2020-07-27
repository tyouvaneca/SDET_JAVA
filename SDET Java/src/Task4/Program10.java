package Task4;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter testcase");
		int t = sc.nextInt();
		long res[] = new long[t];
		long mod = 1000000007;
		int i = 0;
		while (t-- > 0) {

			long invMod = 700000005;
			System.out.println("enter decimal value: ");
			double var = sc.nextDouble();
			String str = String.valueOf(var);
			int decInd = str.indexOf('.');
			String numStrB = str.substring(0, decInd);
			String numStrA = str.substring(decInd + 1);
			for (int j = 0; j < numStrB.length(); j++)
				res[i] += (Long.parseLong(String.valueOf(numStrB.charAt(j))) * Math.pow(10, j));

			for (int j = 0; j < numStrA.length(); j++) {
				res[i] += (Long.parseLong(String.valueOf(numStrA.charAt(j))) * invMod);
				invMod *= invMod;
			}

			res[i] %= mod;
			i++;
		}

		// printing result
		for (long x : res)
			System.out.println(x);
		sc.close();
	}

}
