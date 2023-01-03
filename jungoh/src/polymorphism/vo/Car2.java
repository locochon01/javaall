package polymorphism.vo;

public class Car2 { // extends object // object의 대상속을 받고있음
	// 다형성 polymorphism
	
	/* 자동차라면 갖고 있는 것 */
	
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴개수
	
	public Car2() {} // 기본생성자
	// @@@@@@@@@@@@@@@@@@@ super(); // 부모생성자 맨 위(object 하위)

	public Car2(String engine, String fuel, int wheel) { 
		// 매개변수 생성자
		// 자동완성 사용하기
		
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
	
	@Override // 오버라이드 어노테이션 꼭 작성!
	// 엔진/연료/바퀴개수 toString override
	
	public String toString() {
		return engine + "/" + fuel + "/" + wheel;
	}
	
}

	
	