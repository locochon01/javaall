package edu.kr.control.condition;

import java.util.Scanner;

public class SwitchExample {

	/*
	 * switch 문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 실행된다.
	 * 
	 * 
	 * [작성법]
	 * 
	 * switch(식) {
	 * 
	 * 	case 결과값1 : 수행코드1, break;
	 * 	case 결과값2 : 수행코드2; break;
	 * 	case 결과값3 : 수행코드3; break;
	 * 
	 * default : case를 모두 만족하지 않은 경우 수행하는 코드(==else)
	 * 
	 * }
	 * 
	 * */
	
	public void ex1() {
			// 키보드로 정수를 입력 받아
			// 1 이면 "빨강색"
			// 2 이면 "주황색"
			// 3 이면 "노랑색"
			// 4 이면 "초록색"
			// 1~4 사이 숫자가 아니면 "흰색"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int input = sc.nextInt();
		
		String result;
		
		/*
		if(input == 1) {
			result = "빨강";
		} else if(input == 2) {
			result = "주황";
		} else if(input ==3) {
			result = "노랑";
		} else if(input ==4) {
			result = "초록";
		} else {
			result = "흰색";
		}
		
		System.out.println(result); */
	
		switch(input) {
		
		case 1 : result = "빨강"; break;
		case 2 : result = "주황"; break;
		case 3 : result = "노랑"; break;
		case 4 : result = "초록"; break;
		default : result = "흰색"; // default는 break 넣을 필요 없다
		}
		
		System.out.println(result);
	}
	
	public void ex2() {
		// 달 입력시 계절 판별(Switch 버전)
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력");
		int month = sc.nextInt();
		
		String result;
		
		/*
		if(month == 3 || month == 4 || month ==5) {
			result = "봄"
		if(month == 6 || month == 7 || month ==8) {
			result = "여름"
		if(month == 9 || month == 10 || month ==11) {
			result = "가을"
		if(month == 12 || month == 1 || month ==2) {
			result = "겨울"
					*/
					
		switch(month) {
					
		case 3: case 4: case 5: result = "봄"; break;
		case 6: case 7: case 8: result = "여름"; break;
		case 9: case 10: case 11: result = "가을"; break;
		case 12: case 1: case 2: result = "겨울"; break;
		default : result = "해당하는 계절 없음"; 
					
					// 케이스는 이처럼(3,4,5)연달아 사용할 수 있다
					}
					
					System.out.println(result);
	        	}
	
	
	// 연산자(+ - * / %)
	// 정수 1: 5
	// 정수 2: 10
	// 연산자 : *
	//  계산결과 : 5 * 10 = 50

	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자: ");
		String op = sc.next();
		
		switch(op) {
		case "+" : System.out.printf("%d + %d = %d\n",
				num1, num2, num1 + num2); break;
		case "/" :
			if(num2 == 0) {
				System.out.println("0으로 못나눔");
			}else {
				System.out.printf("%d + %d = %d\n",
						num1, num2, num1 / num2);break;
				
			}
		}
	}
}