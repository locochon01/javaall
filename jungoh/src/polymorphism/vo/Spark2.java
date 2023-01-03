package polymorphism.vo;

public class Spark2 extends Car2 {
	
	private double discountOffer; // 할인혜택
	
	// 기본 생성자
	public Spark2() {} // super() 생략 시 컴파일러 자동 추가

	public Spark2(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}

	public String toString() {
		return super.toString() + "/" + discountOffer;
	}
}
