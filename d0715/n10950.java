package d0715;

import java.util.Scanner;

public class n10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] result = new int[num];
		
		for (int i = 0; i < result.length; i++) {
			result[i]=sc.nextInt()+sc.nextInt();
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
			
		}
	}

}
