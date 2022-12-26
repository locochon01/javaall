package edu.kh.inter.model.service;

import edu.kr.inter.model.vo.Cat;
import edu.kr.inter.model.vo.Chicken;
import edu.kr.inter.model.vo.Dog;
import edu.kr.inter.model.vo.Eagle;
import edu.kr.inter.model.vo.Penguin;
import edu.kr.inter.model.vo.Shark;
import edu.kr.inter.model.vo.Whale;
import edu.kr.inter.model.vo.WaterLife;

public class interfaceService {
	
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
			
			WaterLife[] waterLife = new WaterLife[] {
				(WaterLife)whale, penguin, shark
				//  (WaterLife)implements를 안하면 연결이 안되서 오류가 날 수 있다.
				// 에러났었음 @@@@@@@@@@@@@@@@@
				// 앞에꺼에서 (상속,import) 등에서 잘못된 부분이 있나 확인
			};
			
			for(int i = 0; i < waterLife.length; i++) {
				waterLife[i].water();
				// 관계가 전혀 없는 것들의 관계를 만들어주는 인터페이스
				// 고래, 펭귄, 상어 를 묶어줄 수 있는 이유가
				// WaterLife라는 인터페이스가 있기 때문
				
			}
		}
}