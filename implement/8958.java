//https://www.acmicpc.net/problem/8958
//배열을 이용, if문과 for문의 반복 arr[i].charAt(j)을 이용하여 O,X를 도출해야하는 문제

import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		String arr[] = new String [in.nextInt()];

		for(int i=0; i<arr.length; i++) {
			arr[i] = in.next();
			
		}
			in.close();
			
			for(int i=0; i<arr.length; i++) {
				int sum = 0;
				int cnt = 0;
				for(int j=0; j<arr[i].length(); j++) {
					
					if(arr[i].charAt(j) == 'O') {
						cnt++;
					}
					else {
					cnt = 0;
					}
				sum += cnt;
			}
			System.out.println(sum);
			}
		}	//main end
	} //class end
