package d0722;

import java.util.Scanner;

public class N2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < R; k++) {
					sb.append(s.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		sc.close();
	}

}
