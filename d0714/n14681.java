package d0714;

import java.util.Scanner;

public class n14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int q=0;
		
		if(x<0&&y<0) {
			q=3;
		}else if(x<0&&y>0) {
			q=2;
		}else if(x>0&&y>0) {
			q=1;
		}else if(x>0&&y<0) {
			q=4;
		}
		System.out.println(q);
	}

}
