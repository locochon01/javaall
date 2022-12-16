package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService { 
	// service에서는 기능 적는걸 쓰기로 함
	// 클래스 접근제한자 확인하기
	
	public void ex1() {
		Student std = new Student();
		// import 왜 가능한가? public class인 Student이기 때문이다.

		// TestVO test = new TestVO();
		// (default) class인 TestVO는 import가 불가 -> 다른 패키지이기 때문이다.
		
		System.out.println(std.v1);
		// 다른 패키지에서도 접근 가능한 public만 에러가 없다.
		// 필드 접근 제한자 그림 참조하기
	}
	
	public void ex2() {
		// static 필드 확인 예제
		
		// 학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println(std1.schooLName); // 
		// public 이기 때문에 직접 접근 가능
		// System.out.println(std1.name);
		
		System.out.println("변경 전: " + std1.getName());
		std1.setName("홍길동");
		System.out.println("변경 후: " + std1.getName());
		
		// System.out.println("변경 전: " + std2.schooLName);
		// public 이기 때문에 직접 접근 가능
		
		std1.schooLName = "KH고등학교!";
		System.out.println("변경 후: " + std1.schooLName);
		
		// schooLName에 노란줄이 뜨는 이유! -> 제대로 작성 안해서
		
		// *** static이 붙은 필드(변수)는
		// 클래스명.변수명 으로 사용함
		
		Student.schooLName = "KH";
				System.out.println("Student.schooLname: " + Student.schooLName);
		
		/* static
		 * 
		 * 
		 * 1) 공유 메모리 영역 ( 또는, 정적 메모리 영역 ) 이라고 함
		 * 
		 * => 프로그램 시작 시, static이 붙은 코드들이
		 * 모두 static 이라는 메모리 영역에 생성되고,
		 * 프로그램 종료될 때 까지 사라지지 않음. (정적)
		 * 
		 *** 그리고, static 영역에 생성된 변수는, 어디서든 공유 가능함 ( 공유 메모리 ) 라고 함
		 * 
		 * 2) 사용 법 : 클래스명.변수명
		 * 
		 * 
		 * 
		 */
	}
	public void ex3() {
		// 생성자 확인 테스트
		
		Student s1 = new Student();
					// new Student(); -> 생성자
					// 기본생성자
		
		// User 기본 생성자를 이용하여 객체 생성
		User u2 = new User();
		//u2 인스턴스변수 / user 지역변수
		
		// User 객체 필드 초기화 확인
		System.out.println( u2.getUserID() );
		System.out.println( u2.getUserPW() );
		System.out.println( u2.getUserNAME() );
		System.out.println( u2.getUserAGE() );
		System.out.println( u2.getUserGENDER() );
		System.out.println("====================");
		// 클래스에서 메서드에 getter/setter 미작성 시
		// 간접 접근 불가능
		
		
		
		
		// 문제점 : u1이 참조하고 있는 User 객체와
		//		  u2가 참조하고 있는 User 객체가 필드의 값이 모두 동일함
		//		  이유는? 같은 기본 생성자로 User 객체 생성했기 때문에

		// 해결 방법 1 : setter를 이용해서 새로운 값을 대입
		
		u2.setUserID("asdf1234");
		u2.setUserPW("12345");
		u2.setUserNAME("김영희");
		u2.setUserAGE(19);
		u2.setUserGENDER('F');
		
		System.out.println( u3.getUserID() );
		System.out.println( u3.getUserPW() );
		System.out.println( u3.getUserNAME() );
		System.out.println( u3.getUserAGE() );
		System.out.println( u3.getUserGENDER() );
	}
	
		User u3 = new User("asdf1234" , "12345"); 
		
		
		User u4 = new User("asd123123" , "12345678");
		
		
}
