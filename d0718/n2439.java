package d0718;
import java.io.*;
public class n2439 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			for(int j=N-i; j>0; j--) {
				bw.write(" ");
			}
			for(int j=1; j<=i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}

}
