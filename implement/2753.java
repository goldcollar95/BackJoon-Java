//https://www.acmicpc.net/problem/2753

import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner fr = new Scanner(System.in);
		
		//윤년이면 1, 아니면 0 출력
		int years = fr.nextInt(); //연도
		fr.close();	
	
		
		
		//윤년을 돌기위한 반복문이 필요하다.
		
		
			if(years % 400 == 0) {
				if(years % 4 == 0) 
				System.out.println("1");
				else if(years % 100 == 0) 
					System.out.println("0");
				else System.out.println("1");
					
				}
				else System.out.print("0");
			
		}	//main end
	} //class end

		
		

		
		
	


