package branchpractice;

import java.util.Scanner;

public class BranchPractice {
	
	public void ex1() {
		
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성 (for)
		// 단, 5를 출력하면 반복문을 멈춤! (if)
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) { // 단 5를 출력하면
				break; // 반복문을 멈춤!
			}
			System.out.println(i);
		}
		
		
	}
	
	public void ex2() {
		
		// 0이 입력될 때 까지 모든 정수 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0; // input(0이 입력될 때 까지)
		int sum = 0;	// sum(모든 정수 합 구하기)
		
		// 조건식이 true일 때, 문장 수행해야하니 while문 사용
		while(true) {
			System.out.println("정수 입력: ");
			input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			
			sum += input; // 누적
		}
			System.out.println("합계 : " + sum);
	}
	
	public void ex3() {
		
		// 3의 배수 제외하고 1~10까지 출력 // if,for문 사용
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i + "출력");
		}
	}
	
	public void ex4() {
		
	
	// 1부터 100까지 1씩 증가하며 출력되는 반복문
	// 단, 5의 배수는 건너뛰고, 증가 값이 40이 되었을 때 반복 멈춤
	
		for(int i = 1; i <= 100; i++) {
			if(i == 40) {
				break; // 멈춤
			}
			
			if(i % 5 == 0) {
				continue;
			}
		
			System.out.println(i + "출력");
		}
	}
	
	// 특정 조건을 만족하는 경우를 제외하고자 할 때 유용 = continue
	// 자신이 포함된 가장 가까운 반복문을 빠져나가는 구문 = break
	// 코드 순서는 break 다음 continue를 사용해주어야 함
}

