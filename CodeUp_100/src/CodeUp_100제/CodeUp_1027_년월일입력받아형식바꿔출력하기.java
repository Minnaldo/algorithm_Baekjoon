package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CodeUp_1027_년월일입력받아형식바꿔출력하기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String[] str_arr = str.split("\\.");
		
		System.out.println(str_arr[2] + "-" + str_arr[1] + "-" + str_arr[0]);
	}

}
