package jungoh;

import java.util.Scanner;

public class practice1 {
	/*메소드 명 : public void practice1()
	모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
	1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
	
	[실행화면]
	인원 수 : 29
	사탕 개수 : 100
	1인당 사탕 개수 : 3
	남는 사탕 개수 : 13
	 */
	
	public void practice1() {
		Scanner sc = new Scanner(System.in); // 입력받고
		System.out.println("인원 수 :"); // 스캐너는 입력받고 1.출력, 2. next 받아오기
		int input = sc.nextInt(); // 인원 수니 자료형은 int, sc.nextInt(정수)
		
		System.out.println("사탕 개수 : "); // 필요한것들 더 1.출력 2.next 받아오기
		int candy = sc.nextInt(); // 사탕 개수니 자료형 int, sc.nextInt(정수)
		
		System.out.println("1인당 사탕 개수 : " + candy / input); // /는 나누기
		System.out.println("남는 사탕 개수 : " + candy % input); // %는 나머지 구하기
	}
	
	public void practice2() {
		
		/*키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		
		ex.
		이름 : 홍길동
		학년(정수만) : 3
		반(정수만) : 4
		번호(정수만) : 15
		성별(남학생/여학생) : 남학생
		성적(소수점 아래 둘째 자리까지) : 85.75
		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : "); // 1. 출력
		String name = sc.next(); 	  // 2. sc.next 받아오기
		
		System.err.println("학년 : ");
		String grade = sc.next();
		
		System.out.println("반 : ");
		String classroom = sc.next();
		
		System.out.println("번호 : ");
		int number = sc.nextInt();
		
		System.out.println("성별 : ");
		String gender = sc.next();
		
		System.out.println("성적 : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 %s는 %.2f점 입니다.",
				 grade, classroom, number, gender, score);
	}
	
	public void practice3() {
		/*	메소드 명 : public void practice3(){}
		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		
		[실행화면]
		국어 : 60
		영어 : 80
		수학 : 40
		합계 : 180
		평균 : 60.0
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math; // int sum(합계) = (국+영+수)
		double avg = sum / 3 ;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f " , avg);
		// %구문 쓸때는 printf // +가 아닌 ,사용 기억해두기
		
		// ( %.1f = 소수점  한 자리까지 출력)
		
		
		// + 추가문제
		
		
		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격,
		//아니라면 불합격을 출력하세요.
			
			boolean result = (kor >=40) && (eng >=40) &&
					(math >=40) && (avg >=60);
			
			System.out.println( result ? "합격" : "불합격");
			// 조건식 ? 식1 : 식2
			
		
		
		
	}	
	
	public void practice4() {
		for(int i = 1; i<=9; i+=2)
			
		System.out.println(2 + "*" + i + "=" + (2*i));
	}
	
	/* getter / setter
	 * public String getMemberid() {
	 * return = memberid;
	 * }
	 * 
	 * public void setMemberid(String memberid) {
	 * this.memberid = memberid;
	 * }
	 * 
	 * 
	 * 
	 */
}
