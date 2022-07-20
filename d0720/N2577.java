package d0720;

import java.util.Scanner;

public class N2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int num = A * B * C;
		String s = Integer.toString(num);
		int[] count = new int[10];

		for (int i = 0; i < s.length(); i++) {
			for(int j=0; j<10; j++) {
				if(s.charAt(i)-'0'==j) {
					count[j]+=1;
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}
		
	}

}
