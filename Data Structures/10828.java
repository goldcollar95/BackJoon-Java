//https://www.acmicpc.net/problem/10828
//다시한번풀어봐야할문제 처음에 stack을 api로 돌려 여러개의 객체를 만들려고했다. 많은 변수값안에서 switch제어문으로 스택에 해당하는 내용들을 switch/case문으로 사용해야하는것이 효율적으로 보인다
//각각을 출력을 나타내야하니, 각자 용도에 맞게 함수를 쓰는것이 이 문제의 중요한 포인트인것 같다. 


import java.util.Scanner;

public class Main {
	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = in.nextInt(); // 14개 개수
		stack = new int[N]; // 객체 생성

		for (int i = 0; i < N; i++) {
			String str = in.next();

			switch (str) {

			case "push":
				push(in.nextInt());
				break;

			case "pop":
				sb.append(pop()).append('\n');
				break;

			case "size":
				sb.append(size()).append('\n');
				break;
			case "empty":
				sb.append(empty()).append('\n');
				break;
			case "top":
				sb.append(top()).append('\n');
			}

		}
		System.out.println(sb);

	}

	public static void push(int item) {
		stack[size] = item;
		size++;
	}

	public static int pop() {
		if (size == 0) {
			return -1;
		} else {
			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res;
		}
	}

	public static int size() {
		return size;
	}

	public static int empty() {
		if (size == 0) {
			return 1;

		} else {
			return 0;
		}
	}

	public static int top() {
		if (size == 0) {
			return -1;
		} else {
			return stack[size - 1];
		}

//		push X: 정수 X를 스택에 넣는 연산이다.
//		pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 스택에 들어있는 정수의 개수를 출력한다.
//		empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//		top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

	}// class end
}// main end
