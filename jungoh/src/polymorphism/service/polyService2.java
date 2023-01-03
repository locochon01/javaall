package polymorphism.service;

import polymorphism.vo.Car2;
import polymorphism.vo.Spark2;
import polymorphism.vo.Tesla2;

public class polyService2 {

	// ************* 다형성(업캐스팅) ************ 
	
	public void ex1() {
		// 다형성 확인 예제
		
		// Car 객체부터 생성
		Car2 car = new Car2();
		Tesla2 tesla = new Tesla2();
		Car2 car2 = new Tesla2();
		Car2 car3 = new Spark2();
		
		car2.setEngine(("v6 6기통 엔진"));
		car2.setFuel("휘발유");
		car.setWheel(4);
		
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(100000000);
		
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		//car2.setBatteryCapacity(100000000); (부모에 메서드x undefinded 오류남)
		
		car3.setEngine("경차 엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);	
		//car3.setDiscountOffer(0.5); (부모에 메서드x undefinded 오류남)
		
		Car2[] arr = new Car2[3];
		arr[0] = car; // car
		arr[1] = car2; // spark 
		arr[2] = car3; // tesla
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
