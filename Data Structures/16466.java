//https://www.acmicpc.net/problem/16466
//논리적인 접근이 필요함
//예제를 파악 후 그 다음 숫자들이 어떻게 이어질지 생각해내야함
//만약 숫자가 이어지지않는다면 예외처리를 이용하여 값을 생성. 좋은문제라고 생각함
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] arr = new int[N];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] != i + 1 ) {	// 4에서 5가 아닐때 +1 씩 증가 
				System.out.println(i+1);
				cnt++;
				break;
			}
		}
		if(cnt == 0)	//두번째 예제입력 예외처리를 통해 결과값이 0일때 +1을 하도록 출력.
			System.out.println(arr.length+1);

		
	}// class end
}// main end
