package d0719;

import java.util.Scanner;

public class N2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int money = 0;
		
		if(x==y&& y==x && x==z) {
			money=10000+x*1000;
		}else if(x==y) {
			money=1000+x*100;
		}else if(y==z) {
			money=1000+y*100;
		}else if(x==z) {
			money=1000+x*100;
		}else {
			money = Math.max(x, Math.max(y, z))*100;
		}
		System.out.println(money);
	}

}
