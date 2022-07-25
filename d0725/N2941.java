package d0725;

import java.util.Scanner;

public class N2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int cnt = s.length();
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '=') {
				if (s.charAt(i - 1) == 'c' || s.charAt(i - 1) == 's') {
					cnt--;
					continue;
				}
				if (s.charAt(i - 1) == 'z') {
					cnt--;
					if (i>1&&s.charAt(i - 2) == 'd') {
						cnt--;
					}
					continue;
				}
			}
			
			if(s.charAt(i)=='-') {
				if (s.charAt(i - 1) == 'c' || s.charAt(i - 1) == 'd') {
					cnt--;
					continue;
				}
			}
			
			if(s.charAt(i)=='j') {
				if (s.charAt(i - 1) == 'l' || s.charAt(i - 1) == 'n') {
					cnt--;
					continue;
				}
			}
			
		}
		System.out.println(cnt);

	}

}
