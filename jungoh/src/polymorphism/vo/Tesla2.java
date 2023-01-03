package polymorphism.vo; // car-Tesla-spark 순서로 진행했었음

public class Tesla2 extends Car2 {
	// Car를 상속받게 extends Car2(부모) 작성

	private int batteryCapacity; // tesla에선 배터리용량만
	
	public Tesla2() {} // 기본 생성자
	
	/////////// super(); // tostring 하고 넣어보기

	public Tesla2(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	} // 매개변수 생성자 드롭박스 꼭 체크하기

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
	}
	
	// Car : 부모 
	// Tesla,Spark : 자식
	
	
	
	
	
}
