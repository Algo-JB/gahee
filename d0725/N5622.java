package d0725;
import java.util.Scanner;
public class N5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] dial = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		int[] num = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < dial.length; j++) {
				if(dial[j].contains(String.valueOf(s.charAt(i)))) {
					num[i]=j+2;
					break;
				}
			}
		}
		int time = 0;
		for (int i : num) {
			time += i+1;
		}
		System.out.println(time);
		sc.close();
	}

}
