//https://www.acmicpc.net/problem/2605
//API - LinkedList 추가 List선언해줄때 API활용
//list.add(list.size() - num, i);  list.size의 숫자별로 5가 2칸만 이동하니까 3이 나오도록 구현한다.
package ex;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner fr = new Scanner(System.in);
		int N = fr.nextInt();

		int[] student = new int[N + 1]; // 하나씩 증가
		for (int i = 1; i <= N; i++) {
			student[i] = fr.nextInt();

		}

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1); // 첫번째 서있고
		for (int i = 2; i <= N; i++) {
			int num = student[i];
			if (num == 0) {
				list.add(i);

			}
			if (num >= 1) {
				list.add(list.size() - num, i);
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
