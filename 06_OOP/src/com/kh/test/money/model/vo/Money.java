package com.kh.test.money.model.vo;

public class Money {

	
	private final static String UNIT = "원"; // 변하지 않는 고정된 값
	private int money; // 
	
	public Money() {} // 기본 생성자 ( Money() )
	
	public Money(int money) { // Money(money:int) 만 넣자라는 뜻
		// 매개변수 생성자
		
		this.money = money;
		// 매개변수 생성자 끝
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public static String getUnit() {
		return UNIT;
	}
	
	public void print() { // void면 return이 있으면 안된다
							// static 밑줄OX도 유의
		System.out.println(money + UNIT); // ""를 치면 글자 그대로 나오니 X
		
	}
	
}
