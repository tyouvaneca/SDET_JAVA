package Task2;

import java.util.Scanner;

public class Program4 {

	public static void main(String args[])
	{
		int i, j, k;
		String str;
		char c, ch;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a String : ");
		str=s.nextLine();

		i=str.length();
		for(c='A'; c<='z'; c++)
		{
			k=0;
			for(j=0; j<i; j++)
			{
				ch = str.charAt(j);
				if(ch == c)
				{
					k++;
				}
			}
			if(k>0)
			{
				System.out.println("The character " + c + " has occurred for " + k + " times");
			}
		}
	}
}
