package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {
	public void ex1() {
		// 상속 확인
		// 뭘 확인? 
		// Person을 상속받은 Student가 Person의 필드, 메소드를 사용할 수 있나?
		
		Person p = new Person(); // p라는 person을 만드는 명령어
		
		// p.name = "홍길동"; // X, private 직접접근불가!!
		
		p.setName("홍길동"); // -> setName으로 가서 -> 맨 처음 만든 이름에 저장됨
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName()); // 이후 get으로 출력을 얻어옴
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("=========================="); // 상속시작
		
		// Student 객체 생성
		Student std = new Student(); // // Student 객체 생성 완료
		
		// Student만의 고유 메소드
		std.setGrade(3);
		std.setClassRoom(5);
		
		// Person 클래스로부터 상속받은 메서드
		std.setName("고길동");
		std.setAge(50);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom()); // ★ stduent 클래스에
		
		// Student가 Person의 메소드 뿐 아니라, 필드도 상속 받았는지 확인
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality()); // ★ person 클래스 내용이 추가됨
		
		System.out.println("======================");
		
		p.breath();
		std.breath();
		p.move();
		std.move();
		
		Employee emp = new Employee();
		emp.move();
	}
	
	public void ex2() {
		// super() 생성자 사용 방법
		Student std = new Student("김철수", 17, "한국", 1, 3);
		// std 생성자 먼저 만든 후
		// 매개변수 생성자를 이용하여
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		
	
		
		
	}
	
	public void ex3() {
		Person p = new Person("김은진", 100, "한국");
		
		System.out.println(p.toString()); //"김은진", 100, "한국"
		System.out.println(p);	// "김은진", 100, "한국"
		// print 구문 수행 시 참조변수 명을 작성하면
		// 자동으로 toString() 메소드를 호출해서 출력한다.
		
		// super 참조변수 테스트
		Student std = new Student("김백점", 27, "미국", 2, 6);
		System.out.println( std.toString() );
		
		Employee emp = new Employee("김근로" , 26 , "한국" , "00증권");
		System.out.println( emp.toString() );
	}
	
	
}
