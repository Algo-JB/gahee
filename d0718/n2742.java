package d0718;
import java.io.*;
public class n2742 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=N; i>0; i--) {
			bw.write(i+"\n");
		}
		bw.flush();
	}

}
