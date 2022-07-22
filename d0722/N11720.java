package d0722;

import java.util.Scanner;

public class N11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			int n = s.charAt(i)-'0';
			count += n;
		}
		System.out.println(count);
	}

}
