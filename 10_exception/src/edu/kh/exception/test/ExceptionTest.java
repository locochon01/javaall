package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// int a = 99.9; // 컴파일 에러
		// 개발자가 코드를 잘못 쓴 경우
		// 코드로 수정이 가능하다.
	
		int a = (int)99.9;  //1) 변수 자료형을 double
							//2) (int)99.9 강제 형변환
							//3) 99.9 -> 99 또는 100 정수형으로 바꾸는 방법
		
		
		/*while(true) {
		
			// 0 입력 시 종료되도록 함
			System.out.println("정수 입력(0 입력시 종료) : ");
			int input = sc.nextInt(); 
			
			// 탈출구문
			if(input == 0) {
				break;
			}
			
		}*/
		
		// 런타임 에러 : 프로그램 수행 중 발생하는 에러
		// 			주로 if문으로 처리가 가능하다.
		
		int[] arr = new int[3]; // 길이 3: 인덱스 : 0,1,2까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		if( arr.length >= 3) {
			System.out.println("배열 범위를 초과했습니다.");
			
		} else {
			arr[3] = 40;
		}
		
		//  java.lang.ArrayIndexOutOfBoundsException 배열 범위 초과 예외
		// ==> 배열에서 부적절한 인덱스에 접근하려고 할 때 발생하는 에러!!!
		//  (ExceptionTest.java:42) 42번째 줄에서 오류가 남
		
		
		
	}
}