package d0722;

import java.util.Scanner;

public class N10809 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String alphaStr = "abcdefghijklmnopqrstuvwxyz";
		String s = sc.next();
		char[] alphabet = new char[26];
		int[] count = new int[26];

		for (int i = 0; i < count.length; i++) {
			alphabet[i] = alphaStr.charAt(i);
			count[i] = -1;
		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (s.charAt(i) == alphabet[j] && count[j] == -1) {
					count[j] = i;
					break;
				}
			}
		}

		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
		System.out.println();

	}

}
