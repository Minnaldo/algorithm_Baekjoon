package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CodeUp_1025_정수1개입력받아나누어출력 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		char[] str_arr = str.toCharArray();
		
		String A = str_arr[0] + "0000";
		String B = str_arr[1] + "000";
		String C = str_arr[2] + "00";
		String D = str_arr[3] + "0";
		String E = str_arr[4] + "";
		
		System.out.println("[" + A + "]");
		System.out.println("[" + B + "]");
		System.out.println("[" + C + "]");
		System.out.println("[" + D + "]");
		System.out.println("[" + E + "]");
	}

}
