package d0714;

import java.util.Scanner;

public class n2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int ly = 0;
		if(year%4==0 && year%100!=0) {
			ly = 1;
		}else if(year%400==0) {
			ly = 1;
		}
		System.out.println(ly);
	}

}
