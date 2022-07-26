package d0726;
import java.util.Scanner;
public class N1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int x=1;
		
		if(C-B<=0) {
			x = -1;
		}else {
			x = (A / (C-B))+1;
		}
		System.out.println(x);

	}

}
