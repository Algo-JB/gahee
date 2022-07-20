package d0720;

import java.util.Scanner;

public class N2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int index = 0;
		int[] arr = new int[9];
		
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		

	}

}
