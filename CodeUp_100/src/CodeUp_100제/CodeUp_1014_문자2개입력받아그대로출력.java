package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CodeUp_1014_문자2개입력받아그대로출력 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String c1 = st.nextToken();
		String c2 = st.nextToken();
		
		bw.write(c2 + " ");
		bw.write(c1);
		bw.flush();
		
	}

}
