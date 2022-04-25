package CodeUp_100제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class CodeUp_1094_이상한출석번호부르기2 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < N; i++)
			stack.push(Integer.parseInt(st.nextToken()));
			//stack_arr.add(Integer.parseInt(st.nextToken()));
		
		for(int i = 0; i < N; i++)
			System.out.print(stack.pop() + " ");
		
		
	}

}
