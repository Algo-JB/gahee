package d0721;

import java.util.Scanner;
import java.io.*;

public class N8958 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();

		String s;
		for (int i = 0; i < t; i++) {
			int count = 0;
			int score = 0;
			s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'O') {
					count++;
				}else {
					count=0;
				}
				score += count;
			}
			bw.write(score + "\n");
		}
		bw.flush();
		bw.close();
		sc.close();
	}

}
