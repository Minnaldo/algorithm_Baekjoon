package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CodeUp_1065_정수3개입력받아짝수만출력하기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long num1 = Long.parseLong(st.nextToken());
		long num2 = Long.parseLong(st.nextToken());
		long num3 = Long.parseLong(st.nextToken());
		
		if(num1 % 2 == 0)
			System.out.println(num1);
		if(num2 % 2 == 0)
			System.out.println(num2);
		if(num3 % 2 == 0)
			System.out.println(num3);
		
	}

}
