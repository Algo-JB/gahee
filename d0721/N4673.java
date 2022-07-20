package d0721;

public class N4673 {

	public static void main(String[] args) {
		int num = 1;
		int n = num;
		boolean[] arr = new boolean[10001];
		
		for (int i = 0; i < arr.length; i++) {
			int a = d(i);
			if(a<arr.length) {
				arr[a]=true;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==false) {
				System.out.println(i);
			}
		}
		

	}
	
	static int d(int num) {
		int n = num;
		while (n > 0) {
			num += (n % 10);
			n = n / 10;
		}
		num += n;
		return num;
	}

}
