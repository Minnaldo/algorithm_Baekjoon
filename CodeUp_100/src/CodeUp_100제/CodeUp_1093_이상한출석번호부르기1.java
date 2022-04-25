package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CodeUp_1093_이상한출석번호부르기1 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] N_arr = new int[24];
		
		for(int i = 1; i <= N; i++)
		{
			N_arr[Integer.parseInt(st.nextToken())]++;
		}
		
		for(int i = 1; i <= 23; i++)
		{
			System.out.print(N_arr[i] + " ");
		}
		
		
	}

}
