package d0719;

import java.io.*;
import java.util.StringTokenizer;

public class N10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		s = br.readLine();
		st = new StringTokenizer(s);

		for (int i = 0; i < N; i++) {
			int small = Integer.parseInt(st.nextToken());
			if (small < X) {
				bw.write(small + " ");
			}
		}
		bw.flush();
		bw.close();

	}

}
