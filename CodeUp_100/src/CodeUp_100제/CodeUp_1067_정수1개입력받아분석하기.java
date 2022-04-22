package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CodeUp_1067_정수1개입력받아분석하기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long num1 = Long.parseLong(st.nextToken());
		
		if(num1 > 0)
			System.out.println("plus");
		else if(num1 < 0)
			System.out.println("minus");
		
		if(Math.abs(num1) % 2 == 0)
			System.out.println("even");
		else if(Math.abs(num1) % 2 == 1)
			System.out.println("odd");
		
	}

}
