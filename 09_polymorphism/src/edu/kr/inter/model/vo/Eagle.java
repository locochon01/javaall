package edu.kr.inter.model.vo;

public class Eagle extends TypeBirds{

	@Override
	public void eat() {
		System.out.println("독수리가 밥을 먹는다");
	}

	@Override
	public void cry() {
		System.out.println("독수리가 운다");
	}

	@Override
	public void move() {
		System.out.println("독수리가 움직인다");		
	}

}
