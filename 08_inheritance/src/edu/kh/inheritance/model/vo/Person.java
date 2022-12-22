package edu.kh.inheritance.model.vo;

public class Person {
	// 필드
	// 국민이라면 갖고 있는 것 
	private String name; // 이름
	private int age; // 나이
	private String nationality; // 국적
	
	
	
	//생성자 ( 클래스명과 동일하게 기본생성 )
	public Person() {} //기본 생성자 
	
	//매개변수 생성자 ( 필드에 있는 애들 다 받아옴 )
	public Person(String name, int age, String nationality) {}

	//메서드
	// ( getter / setter )
	// 1. public으로 사용하여야 함
	// 2. getter에는 			 + return
	// 2. setter에는 void값 적용 + this
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	
	}
	
	public void breath() {
		System.out.println("사람은 코나 입으로 숨쉰다.");
	}
	
	public void move() {
		System.out.println("사람은 움직일 수 있다.");
	}
	
	// toString() 메서드는 객체가 가지고 있는 모든 값(필드)를
	// 하나의 문자열로 반환하는 용도의 메서드
	
	@Override
	public String toString() {
		return name + " / " + age + " / " + nationality;
				// 김철수 / 17 / 대한민국
	}
}
