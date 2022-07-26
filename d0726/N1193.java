package d0726;
import java.util.Scanner;
public class N1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int sum = 1;
		int cnt = 1;
		
		if(X==1) {
			System.out.println("1/1");
		}else {
			while(true) {
				cnt++;
				if(sum+cnt>=X) {
					break;
				}
				sum+=cnt;
			}
			int order = X-sum;
			if(cnt%2==0) {
				System.out.println(order+"/"+(cnt-order+1));
			}else {
				System.out.println((cnt-order+1)+"/"+order);
			}
			
		}
		
		
	}

}
