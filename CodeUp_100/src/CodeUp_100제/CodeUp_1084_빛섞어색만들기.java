package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CodeUp_1084_빛섞어색만들기 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int count = 0;
		
		for(int i = 0; i < R; i++)
		{
			for(int j = 0; j < G; j++)
			{
				for(int k = 0; k < B; k++)
				{
					bw.write(i + " " + j + " " + k + "\n");
					count++;
				}
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		
	}

}
