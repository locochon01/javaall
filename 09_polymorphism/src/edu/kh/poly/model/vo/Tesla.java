package edu.kh.poly.model.vo;

public class Tesla extends Car { 
	//전기차 // 2번째 클래스, Car 클래스 상속받기
	// Car를 상속받을 수 있도록! => extends Car(부모)

	private int batteryCapacity; // 배터리 용량
	
	public Tesla() { // Ctrl + Space + Enter 
					 // 기본생성자 단축키!!
		
		super(); // 바로 위 부모
				 //car, 헷갈리면 ctrl 클릭해서 넘어가보기
	}
	
	// alt + shift + s -> o 드롭박스 -> 매개변수
	// 오브젝트 생성자 단축키 후 [위에 바] 클릭해서 선택하기
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel); // 상속받은 부모값이 받아와짐
		this.batteryCapacity = batteryCapacity;
		
		
	}

	// getter/setter
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	@Override // 어노테이션 필수
	public String toString() {
		// super 참조변수
		return super.toString() + " / " + batteryCapacity;
	} 
	
	// 정리 Car : 부모 / Tesla,Spark : 자식
}
