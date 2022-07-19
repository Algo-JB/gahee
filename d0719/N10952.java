package d0719;

import java.io.*;
import java.util.StringTokenizer;
public class N10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int A,B;
		while(true) {
			s = br.readLine();
			st = new StringTokenizer(s);
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			if(A==0 && B==0) {
				break;
			}else {
				bw.write((A+B)+"\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
