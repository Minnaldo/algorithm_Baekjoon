package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CodeUp_1090_수나열하기2 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long d = Long.parseLong(st.nextToken());
		long n = Long.parseLong(st.nextToken());
		
		long result = 0;
		result = a;
		
		for(int i = 1; i < n; i++)
		{
			result *= d; 
		}
		
		System.out.println(result);
		
	}

}
