package d0726;
import java.util.Scanner;
public class N2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 1;
		int sum = 1;
		
		while(N>sum) {
			cnt++;
			sum += 6*(cnt-1);
		}
		System.out.println(cnt);

	}

}
