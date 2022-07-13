package d0713;

import java.util.Scanner;

public class n2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int c = B%10;
		int d = (B/10)%10;
		int e = B/100;
		
		System.out.println(A*c);
		System.out.println(A*d);
		System.out.println(A*e);
		System.out.println(A*B);

	}

}
