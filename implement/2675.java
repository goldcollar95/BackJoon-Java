//https://www.acmicpc.net/problem/2675

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		

		// **입력값은 T와 R과 S를 받게된다.
		Scanner fr = new Scanner(System.in);
		// 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
		int T = fr.nextInt();
		for (int i = 0; i < T; i++) {
			// 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다.
			int R = fr.nextInt();
			// 문자열 S가 공백으로 구분되어 주어진다.
			String S = fr.next();
			// S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 20글자의 길이가 붙으니 length를 사용한다.
			for (int j = 0; j < S.length(); j++) {
				// 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8)
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}

		}

	}

} // main end
//class end
