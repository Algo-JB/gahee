package d0715;

import java.util.Scanner;

public class n8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			answer += i;
		}
		System.out.println(answer);

	}

}
