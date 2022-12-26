package edu.kh.poly.model.vo;

public class Car { //extends object // object의 대상속을 받고있음!! 
	// 다형성 polymorphism
	
	/* 자동차라면 가지고 있는 것 */
	
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴개수
	
	public Car() { // 기본생성자도 생성해주고
		// 안적으면 컴파일러가 자동으로 만들어준다!
		
		super(); // 부모생성자(object) 

		
	}
	
	// 매개변수 생성자
	// 자동완성 사용

	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}	
	
	// Object.toString()에 있던걸 오버라이딩 했다는 뜻
	
	@Override // 오버라이드 했다는걸 알려주는 Override 어노테이션 꼭 작성 
	public String toString() {
		// 엔진 / 연료 / 바퀴개수
		return engine + "/" + fuel + "/" + wheel;
		
	}
}
