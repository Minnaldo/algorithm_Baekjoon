package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CodeUp_1045_정수2개입력받아자동계산하기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long num1 = Long.parseLong(st.nextToken());
		long num2 = Long.parseLong(st.nextToken());
		
		long sum = num1 + num2;
		long min = num1 - num2;
		long mul = num1 * num2;
		long div = num1 / num2;
		long rem = num1 % num2;
		float div_float = (float)num1 / (float)num2;
		
		System.out.println(sum);
		System.out.println(min);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
		System.out.println(String.format("%.2f", div_float));
	}

}
