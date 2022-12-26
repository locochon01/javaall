package edu.kr.inter.model.vo;

public abstract class Animal { // abstract
	
	// (동물이라는 타입을 보았다)
	// abstract 붙는 순간, 객체화(인스턴스화)가 안되는 클래스!
	// 단, 타입으로서의 의미는 그대로!
	
	public abstract void eat(); // 추상메서드
	
	//먹기라는 메서드는 있지만, 어떻게 동작할지 정의하지 않아야 한다.
	// + 추상메소드가 있다면, 추상클래스여야 함
	//중괄호==정의, 추상메서드를 소괄호+세미콜론으로 마무리 해야함
	
	public abstract void cry(); // abstract 잡아주기
	public abstract void move(); // abstract 잡아주기
}
