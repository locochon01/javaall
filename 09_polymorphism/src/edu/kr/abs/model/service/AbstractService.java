package edu.kr.abs.model.service;

import edu.kr.abs.model.vo.Animal;
import edu.kr.abs.model.vo.Cat;
import edu.kr.abs.model.vo.Chicken;
import edu.kr.abs.model.vo.Dog;
import edu.kr.abs.model.vo.Eagle;
import edu.kr.abs.model.vo.Penguin;
import edu.kr.abs.model.vo.Shark;
import edu.kr.abs.model.vo.TypeBirds;
import edu.kr.abs.model.vo.TypeMammalia;
import edu.kr.abs.model.vo.TypePisces;
import edu.kr.abs.model.vo.Whale;

public class AbstractService {
	// Chicken 
	// Eagle 
	// Penguin 
	// Shark 
	// Whale 
	
	// TypeBirds (조류)
	// TypeMammalia (포유류)
	// TypePisces (어류)
	
	
	public void ex1() {
		//  포유류
		Dog dog = new Dog();
		Cat cat = new Cat();
		Whale whale = new Whale();
		
		// 조류
		Chicken chicken = new Chicken();
		Penguin penguin = new Penguin();
		Eagle eagle = new Eagle();
		
		// 어류
		Shark shark = new Shark();
		
	/*
		dog.cry();
		dog.eat();
		dog.move();
		
		cat.cry();
		cat.eat();
		cat.move();
		
		//Animal animal = new Animal();
		// 추상클래스는 객체로 만들 수 없지만, 타입으로서의 역할은 수행
		// 위 에러는 추상클래스를 인스턴스화 할 시 발생하는 에러
	 */
		
		TypeMammalia[] mammalia = new TypeMammalia[] { cat, dog, whale }; // 객체로 받아오기
		TypeBirds[] birds = new TypeBirds[] { chicken, eagle, penguin };
		TypePisces[] pisces = new TypePisces[] { shark };
		
		Animal[] animal = new Animal[] { 
				cat, dog, whale,
				chicken, eagle, penguin,
				shark,
				//mammalia[0], // cat 0 
				//birds[2], // penguin 2
				
				//고양이,펭귄 2번 들어가던 오류 
		};
		
		// 출력하고 싶다. for문 사용해보기
		for(int i = 0; i < animal.length; i++) { // animal의 length만큼 돌기
			animal[i].cry(); // animal i번쨰 인덱스 돌아가면서 찍기
			animal[i].eat(); // animal i번쨰 인덱스 돌아가면서 찍기
			animal[i].move(); // animal i번쨰 인덱스 돌아가면서 찍기
			
			// instanceof 를 사용하여
			//만약 animal중에, Type이 고양이 일 때
			//수유를 한다는 breastfeed() 출력
			
			if(animal[i] instanceof Cat) { // 강제형변환 & 다운캐스팅
				System.out.println("===========고양이는요==========");
				
				((Cat)animal[i]).breastfeed(); // 연산자 우선순위!!
				// 고양이가 소속되어 있는 포유류만 가지고 있던 수유를 하다 메서드
				// Cat 클래스에서 오버라이딩으로 재정의된 내용이 출력된다.
				System.out.println("===========이렇습니다.==========");
			}
			
			if(animal[i] instanceof Eagle) {
				System.out.println("====독수리는====");
				Eagle eg = (Eagle) animal[i];
				eg.fly(); // TypeBirds에서 일반메서드로 정의한 내용
				System.out.println("====이렇습니다.====");
			}
			
			if(animal[i] instanceof Shark) {
				System.out.println("====상어는====");
				Shark sh = (Shark) animal[i];
				sh.swimming(); 
				System.out.println("====이렇습니다.====");		
			}
			
		}
		
	}
}
