package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CodeUp_1079_원하는문자가입력될때까지반복출력하기 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] c_arr = new char[st.countTokens()];
		
		for(int i = 0; i < c_arr.length; i++)
		{
			c_arr[i] = st.nextToken().charAt(0);
		}
		
		for(int i = 0; i < c_arr.length; i++)
		{
			System.out.println(c_arr[i]);
			
			if(c_arr[i] == 'q')
				break;
		}
		
	}

}
