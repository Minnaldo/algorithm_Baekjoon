package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CodeUp_1024_단어1개입력받아나누어출력 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		
		char[] str_arr = str.toCharArray();
		
		for(int i = 0; i < str_arr.length; i++)
		{
			System.out.println("\'" + str_arr[i] + "\'");
		}
	}

}
