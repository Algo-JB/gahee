package d0725;

import java.util.Scanner;
import java.util.ArrayList;

public class N1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		boolean group;

		for (int i = 0; i < N; i++) {
			group = true;
			String s = sc.next();
			ArrayList<Character> ch = new ArrayList<>();
			ch.add(s.charAt(0));
			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(j) != s.charAt(j - 1)) { // 비연속
					if (!ch.contains(s.charAt(j))) {
						ch.add(s.charAt(j));
					} else {
						group = false;
						break;
					}
				} else { // 연속
					if (!ch.contains(s.charAt(j))) {
						ch.add(s.charAt(j));
					}
				}
			}
			if (group == true) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}
}
