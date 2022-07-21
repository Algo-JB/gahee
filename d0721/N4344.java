package d0721;

import java.io.*;
import java.util.Scanner;
public class N4344 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = sc.nextInt();
		int[] score;
		for(int i=0; i<T; i++) {
			int sum=0;
			int num = sc.nextInt();
			score = new int[num];
			for(int j=0; j<num; j++) {
				score[j]=sc.nextInt();
				sum += score[j];
			}
			int avg = sum/num;
			int count=0;
			for(int j=0; j<num; j++) {
				if(score[j]>avg) {
					count++;
				}
			}
			double ratio = count/(num-0.0) * 100;
			bw.write(String.format("%,.3f", ratio)+"%\n");
		}
		bw.flush();
		bw.close();
		sc.close();
	}

}
