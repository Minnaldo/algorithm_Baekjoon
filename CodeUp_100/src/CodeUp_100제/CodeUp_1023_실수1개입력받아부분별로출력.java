package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CodeUp_1023_실수1개입력받아부분별로출력 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String[] str_arr = str.split("\\.");
		
		int A = Integer.parseInt(str_arr[0]);
		int B = Integer.parseInt(str_arr[1]);
		
		System.out.println(A);
		System.out.println(B);
	}

}
