package d0714;

import java.util.Scanner;

public class n2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if(M<45) {
			if(H>=1) {
				H-=1;
			}else if(H==0) {
				H=23;
			}
			M=M+15;
		}else {
			M-=45;
		}
		System.out.println(H+" "+M);
	}

}
