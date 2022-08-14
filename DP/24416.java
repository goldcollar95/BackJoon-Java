//https://www.acmicpc.net/problem/24416

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count = 0;
	static int dp_count = 0;
	static int[] num;

	public static void main(String[] args) throws IOException {
		BufferedReader ls = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(ls.readLine());
		num = new int[n];
		fib(n);
		fibonacci(n);
		System.out.println(count);
		System.out.println(dp_count);
	}

	public static int fib(int n) {

		if (n == 1 || n == 2) {
			count++;
			return 1;
		}
		return fib(n - 1) + fib(n - 2);

	}

	public static int fibonacci(int n) {
		num[1] = 0;
		num[2] = 0;

		for (int i = 2; i < n; i++) {
			dp_count++;
			num[i] = num[i - 1] + num[i - 2];
		}
		return num[n - 1];

	}// main end
}// class end
