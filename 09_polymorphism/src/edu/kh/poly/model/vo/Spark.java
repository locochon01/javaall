package edu.kh.poly.model.vo;

public class Spark extends Car { // 경차
	
	private double discountOffer; // 할인혜택
	
	// 기본 생성자
	public Spark() {} // super() 생략 시 컴파일러가 자동 추가

	
	//// alt + shift + s -> o 드롭박스 -> 매개변수 생성자 추가생성
	// 오브젝트 생성자 단축키 후 [위에 바] 클릭해서 선택하기
	
	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}


	public double getDiscountOffer() {
		return discountOffer;
	}


	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	@Override
	public String toString() {
		return super.toString() + "/" + discountOffer;
		
	}
	

}
