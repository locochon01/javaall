package edu.kr.inter.model.vo;

public class Chicken extends TypeBirds {

	@Override
	public void eat() {
		System.out.println("닭이 밥을 먹는다.");
	}

	@Override
	public void cry() {
		System.out.println("닭이 운다.");
	}

	@Override
	public void move() {
		System.out.println("닭이 움직인다.");
	} // extends Type 관계 써주기

}
