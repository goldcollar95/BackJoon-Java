//https://www.acmicpc.net/problem/2490


import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0; // 카운터 선언
		int[] arr = new int[4]; //인덱스 도[0] 개[1] 걸[2] 윳[3] 모[4]
		for(int i = 0; i < 3 ; i++) { 	// 3번 게임을 진행
			cnt = 0;
			for(int j = 0; j < 4 ; j++) { 	//4번의 결과값
				arr[j] = sc.nextInt();
				if(arr[j] == 1) {
					cnt++;
					
				}
			}
			if(cnt == 0) {
				System.out.println("D");
			}
			else if(cnt == 1) {
				System.out.println("C");
			}
			else if(cnt == 2) {
				System.out.println("B");
			}
			else if(cnt == 3) {
				System.out.println("A");
			}
			else if(cnt == 4) {
				System.out.println("E");
			}
		}
		
	}	//main end
}//class end

			

		

		
		
	


