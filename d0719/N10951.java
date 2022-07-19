package d0719;

import java.io.*;
import java.util.StringTokenizer;
public class N10951 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int A,B;
		while((s=br.readLine())!=null) {
			st = new StringTokenizer(s);
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			bw.write((A+B)+"\n");
		}
		bw.flush();
		bw.close();
	}

}
