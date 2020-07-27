package Task2;

import java.util.Arrays;

public class Program9 {

	public static void main(String[] args) {
		
		char[] ch = { 'Y', 'O', 'U', 'V', 'A', 'N', 'E', 'C', 'A' };
		String st = String.valueOf(ch);
		System.out.println("Char to String: " + st);
		char[] chars = st.toCharArray();
		System.out.println("String to Char: " + Arrays.toString(chars));
	}

}
