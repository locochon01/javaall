package edu.kr.control.loop;

import java.util.Scanner;

public class ForExample {

	/* for문
	 *  - 끝이 정해져 있는(횟수가 정해져있는) 반복문
	 *	- 조건에 따라 한번도 수행되지 않을 수 있음
	 *	
	 *	[작성법]
	 *
	 * for(초기식; 조건식; 증감식) {
	 * 		반복 수행할 코드
	 * }
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * - 조건식 : for문의 반복여부를 지정하는 식 ( 다음 반복 진행해? )
	 * 			보통 초기식에 사용된 변수를 이용하여, 조건식을 작성함.
	 *
	 * - 증감식 : 초기식에 사용된 변수를
	 * 			for문이 끝날 때 마다 증가 or 감소 시켜서
	 * 			조건식의 결과를 변하게 하는 식
	 *
	 *
	 * 
	 */
	
	public void ex1() {
			// 1~10까지 출력하기
			// -> 1부터 10까지 1씩 증가하며 출력된다는 것
			// 1부터 10까지 증가하니 감소된 상태부터<=
			// <11 도 사용할 수 있다.
			// ++ 1씩 증가한다.
			// * 반복문은 조건식이 true 일 때만 반복
		
			// 왜 i를 사용하는가? index
		
			for(int i = 1; i <= 10; i++) {
			// 1) 초기식; 2)조건식; 4)증감식
				System.out.println("i:" + i);
				// 3) 반복 수행될 코드
			}
	}
	
	public void ex2() {
			// 3에서 7까지 출력하기
			// 3 4 5 6 7
		
			for(int i = 3; i <= 7; i++) {
				System.out.println(i);
				
			}
	}
	
	public void ex3() {
			// 1부터 (입력받은 수 까지) 1씩 증가하며 출력
		
			Scanner sc = new Scanner(System.in);
			System.out.println("입력: ");
			int input = sc.nextInt();
			
			for(int i = 1; i <= input; i++) {
				System.out.println("출력: " + i);
			}
	}
	
	public void ex4() {
			// 1.0부터 입력 받은 실수 까지 0.5씩 증가하며 출력
		
			Scanner sc= new Scanner(System.in);
			System.out.println("입력: ");
			double input = sc.nextDouble();
			
			for(double i= 1.0; i <= input; i +=0.5) {
				System.out.println("출력: " + i);
			}
			
	}
	
	public void ex5() {
			// 영어 알파벳 A 부터 Z까지 한 줄로 출력
			// ** char 자료형은? 유니코드
		

			for(char i = 'A'; i <= 'Z'; i++) {
				System.out.print(i);
			}
	}
	
	public void ex6() {
		// 응용문제!
		// 1부터 10까지 모든 정수의 합 구하기
		// 합계 : 55
			int sum = 0; // 반복되어 증가되는 i값의 합계를 저장할 변수
						// 0으로 시작하는 이유는
						// 아무것도 더하지 않으므로 정확히 결과를 도출할 수 있기때문
			
			for(int i = 1; i <= 10; i++) {
				sum += i;
				// sum = sum + i;
				
			System.out.println("합계 :" + sum);
		}
	}
	
	public void ex7() {

			// 1부터 20까지 1씩 증가하면서 출력
			// 단, 5의 배수에 () 를 붙여서 출력 -> 조건
			// ex) 1 2 3 4 (5) 6 7 8 9 (10) ...
			
			
			for(int i = 1; i <= 20; i++) {
			
				if(i % 5 == 0) {
				System.out.print("(" + i + ") ");
				} else {
				System.out.print(i + " ");
				}
			}
	}
	
	// **** 중첩 반복문 ****
	
	public void ex8() {
		// 구구단 모두 출력하기
		
		for(int dan = 2; dan <= 9; dan++) {  //단 2~9단까지 차례대로 증가
			for(int su = 1; su <= 9; su++) {  //수 각 단에 곱해질 수 1~9까지 차례대로 증가
				System.out.printf("%2d X %2d = %2d", dan, su, dan*su);
			}
				System.out.println(); // 줄바꿈
	}
}
	
	public void ex9() {
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int dan = 1; dan <= 5; dan++) { // 5바퀴 반복하는 for문
			for(int su = 1; su <= 5; su++) { // 12345 한 줄 출력하는 for문
				System.out.print(su);
				}
				System.out.println();
		}
	}
	
	public void ex10() {
		
		//54321
		//54321
		//54321
		
		for(int dan = 1; dan <= 3; dan++) {
			for(int su = 5; su >= 1; su--) {
				System.out.print(su);
			}
				System.out.println();
		}
	}
	
	public void ex11() {
		
		// 1
		// 12
		// 123
		// 1234
		
		for(int x = 1; x <= 4; x++) {
			for(int i = 1; i <= x; i++) {
				System.out.print(i);
			}
				System.out.println();
		}
	}
	
	public void ex12() {
		
		// 4321
		// 321
		// 21
		// 1
		
		for(int x = 4; x >= 1; x--) {
			for(int i = x; i >= 1; i--) {
				System.out.print(i);
			}
				System.out.println();
		}
	}
	
	public void ex13() {
		
		
	}
}