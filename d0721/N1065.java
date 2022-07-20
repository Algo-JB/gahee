package d0721;
import java.util.Scanner;
public class N1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[4];
		int count = 0;
		for(int i=1; i<=N; i++) {
			int a = i;
			int c=0;
			while(a>0) {
				arr[c]=a%10;
				System.out.println(arr[c]);
				a=a/10;
				c++;
			}
			arr[c]=a%10;
			for (int j = 0; j < arr.length; j++) {
				System.out.println("arr["+j+"]: "+arr[j]);
			}
			if (arr.length<=2) {
				count++;
			}else if(Math.abs(arr[0]-arr[1])==Math.abs(arr[1]-arr[2])){
				count++;
			}
		}
		System.out.println(count);
		sc.close();

	}

}
