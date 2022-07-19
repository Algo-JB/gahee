package d0719;

import java.util.Scanner;

public class N1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a,b;
		int c, num = N, cycle = 0;
		while (true) {
			cycle++;
			a = num / 10;
			b = num % 10;
			if (a + b >= 10) {
				c = (a + b) % 10;
			} else {
				c = a + b;
			}
			num = (b * 10) + c;
			if (num == N) {
				break;
			}
		}
		System.out.println(cycle);

	}

}
