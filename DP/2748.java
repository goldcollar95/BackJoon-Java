//https://www.acmicpc.net/problem/2748 

import java.util.Scanner;

public class Main {
	static long[] arr;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		arr = new long[N+1];
		for(int i = 0; i<N +1; i++) {
			arr[i] = -1;
		}
		arr[0] = 0;
		arr[1] = 1;
		System.out.println(Fibo(N));
	}
	
		public static long Fibo(int N) {
			if(arr[N] == -1) {
				arr[N] = Fibo(N-1)+Fibo(N-2);
			}
			return arr[N];
	

//		//메모제이션을 이용하여 푼 공식;
//		Scanner in = new Scanner(System.in);
//		int T = in.nextInt();
//		int result = 0;
//		int count = 0;
//		for (int i = 0; i < T; i++) {
//			for (int j = 1; j < T; j++) {
//				int sum = i + j;
//				if(i+j == result)
//					sum += result;
//					count++;
//				
//			}
//		}
//
//		System.out.println(result);


		}//main end
}// class end
