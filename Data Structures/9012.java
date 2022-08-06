//https://www.acmicpc.net/problem/9012


import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i = 0; i < T; i++) {
			System.out.println(function(in.next()));
			
			}
		}
	
	public static String function(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i<s.length(); i++) {
			char w = s.charAt(i);
			
			if(w == '(') {
				stack.push(w);
			}
			
			else if(stack.empty()) {
				return "NO";
			}
			
			else {
				stack.pop();
			}
		}
		
		if(stack.empty()) {
			return "YES";
		}
		else {
			return "NO";
		}
		
		
		
		
		
//		StringBuilder sb = new StringBuilder();
//		String VPS ="";
//		int a = in.nextInt();
//		String b = new String ("(");
//		String b1 = new String (")");
//		for(int i = 0; i<b.length(); i++) {
//			for(int j = 0; j<b1.length(); j++) {
//				
//				
//				if(b.equals(b1))
//			}
//			
//		}
		
	
	}// class end
}// main end
