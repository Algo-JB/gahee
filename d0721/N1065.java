package d0721;

import java.util.Scanner;

public class N1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (i < 100) {
				count++;
			} else {
				int num = i;
				int one = num % 10;
				num /= 10;
				int ten = num % 10;
				num /= 10;
				int hun = num % 10;
				if (i >= 1000) {
					num /= 10;
					int thou = num % 10;
					if ((ten - one) == (hun - ten) && (ten - one) == (thou - hun)) {
						count++;
					}
				} else if ((ten - one) == (hun - ten)) {
					count++;
				}

			}
		}
		System.out.println(count);
		sc.close();

	}

}
