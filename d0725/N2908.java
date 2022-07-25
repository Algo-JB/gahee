package d0725;

import java.util.Scanner;

public class N2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);

		int n1 = Integer.parseInt(sb1.reverse().toString());
		int n2 = Integer.parseInt(sb2.reverse().toString());

		if (n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}

	}

}
