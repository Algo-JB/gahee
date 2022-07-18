package d0715;

import java.io.*;
import java.util.Scanner;

public class n2741 {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = sc.nextInt();
		for (int i = 1; i<= N; i++) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
		sc.close();
	}

}
