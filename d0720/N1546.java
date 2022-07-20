package d0720;

import java.util.Scanner;

public class N1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		float max = 0;
		float sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < N; i++) {
			sum+= (arr[i] / max) * 100;
		}
		System.out.println(sum / N);
		sc.close();

	}

}
