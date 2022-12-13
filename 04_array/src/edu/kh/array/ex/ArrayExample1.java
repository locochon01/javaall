package edu.kh.array.ex;
import java.util.Scanner;

public class ArrayExample1 {
		
		public void ex9() {
			//1. 문자열을 입력 받아 한 글자씩 잘라내여 char 배열에 순서대로 저장
			
			//2. 문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇 개 존재하는지 확인
			
			//3. 단, 일치하는 문자가 없을 경우 "존재하지 않습니다." 출력
			
			//[사용 해야하는 기술, 기능]
			
			// 1) 배열 검색
			// 2) String length() : 문자열의 길이
			// ex) "Hello".length() -> 5
			
			// 3) String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴
			// ex) "Hello".charAt(1) -> 'e'
			//		01234
			
			// 4) count (숫자 세기)
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("문자열 입력: ");
			
			String input = sc.nextLine();
			// hello
			
			//1. 문자열을 입력 받아 한 글자씩 잘라내여 char 배열에 순서대로 저장
			char[] arr = new char[input.length()]; // 공간 생성
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = input.charAt(i);
			}
			// heap 영역 속 01234 index, hello 표현한 식
			// 중간확인과정
			// System.out.println(Arrays.toString(arr));
				
			//2. 문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇 개 존재하는지 확인
				System.out.println("검색할 문자 입력: ");
				char ch = sc.nextLine().charAt(0);
								// String.charAt(0) : 문자열 제일 앞 문자
			
				int count = 0; // 같은 글자 개수 세기 위한 변수
			
				for(int i = 0; i< arr.length; i++) {
					if(arr[i] == ch) {
						count ++;
					
				}
			}
				// 결과 출력
				if(count > 0) {
					System.out.println(count + "개 있음");
				} else {
					System.out.println("존재하지 않음");
					
					//double 자료형을 5개 담을 수 있는 공간 arr 을 생성
					// double arr[] = new double[5];
		}
	}
}
