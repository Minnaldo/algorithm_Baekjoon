package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CodeUp_1015_실수입력받아둘째자리까지출력 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		float N = Float.parseFloat(br.readLine());
		
		String str = String.format("%.2f", N);
		
		System.out.println(str);
	}

}
