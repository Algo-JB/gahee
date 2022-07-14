package d0714;

import java.util.Scanner;

public class n2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int time = sc.nextInt();
		
		if(M+time>59) {
			if((M+time)/60>=1) {
				int h = (M+time)/60;
				int m = (M+time)%60;
				if(H+h>23) {
					H=H+h-24;
				}else {
					H+=h;
				}
				M=m;
				
			}
		}else {
			M+=time;
		}
		
		System.out.println(H+" "+M);
	}

}
