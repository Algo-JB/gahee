package d0722;

import java.util.Scanner;

public class N1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s=s.toUpperCase();
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] alpha = new char[26];
		int[] cnt = new int[26];
		int index = -1;

		for (int i = 0; i < cnt.length; i++) {
			alpha[i] = alphabet.charAt(i);
			cnt[i] = 0;
		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < alpha.length; j++) {
				if (s.charAt(i) == alpha[j]) {
					cnt[j]++;
					break;
				}
			}
		}
		int max = 0;
		for (int i = 0; i < cnt.length; i++) {
			if (max < cnt[i]) {
				max = cnt[i];
				index = i;
			}else if(max == cnt[i]) {
				index = -1;
			}
		}
		if(index>-1) {
			System.out.println(alpha[index]);
		}else {
			System.out.println("?");
		}

		

	}

}
