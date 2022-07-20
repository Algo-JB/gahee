package d0720;

import java.util.Scanner;

public class N3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] o = new int[10];
		int count=10;
		for(int i=0; i<10; i++) {
			arr[i]=sc.nextInt()%42;
			for(int j=0; j<i; j++) {
				if(arr[j]==arr[i]) {
					count-=1;
					break;
				}
			}
		}
		
		System.out.println(count);
	}

}
