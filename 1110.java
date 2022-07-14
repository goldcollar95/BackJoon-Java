//https://www.acmicpc.net/problem/1110

import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner fr = new Scanner(System.in);
		
		int N = fr.nextInt();
		fr.close();
		
		// cnt가 if문안에 26이 제자리에 올수있도록 변수선언
		int count = 0;
		// 2+6 = 8 > 6+8 = 14 > 8+4 = 12 > 4+2 = 6 > 26
		int repeat = N;
		
		while(true) {
			N = ((N%10)*10) + ((N/10 + N%10)%10);
			count++;
			
			if(repeat == N)
				break;
		
		}
		System.out.println(count);
			
		}	//main end
	} //class end

		
		

		
		
	


