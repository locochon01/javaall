package edu.kh.op.ex;

// 예제 코드 작성용 클래스
public class OpExample {

	// 기능 메소드 method : 객체 지향 프로그래밍에서
	// 객체와 관련된 서브루틴 or 함수
	public void ex1() {
		// void : return 값이 없는 메소드에 작성
		
		System.out.println("OpExample 클래스에 + ex1() 기능 수행");
	}
	
	// tip! : 하나의 메소드 안엔, 하나의 기능만 정의해야한다.
	public void ex2() {
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1:" + iNum1);
		System.out.println("iNum2:" + iNum2);
		
	}
		public void ex3() {
			// 전위연산 : ++3, --2 연산자가 앞쪽에 배치
			// -> 다른 연산자보다 먼저 증감/감소
			int temp1 = 5;
			System.out.println(++temp1 + 5); // 11
			// -> ++->(6) + temp1(5) == 11 ( 5는 의미가 없음)
			
			// 후위연산 : 10++, 6-- 연산자가 뒤쪽에 배치
			// -> 다른 연산자보다 나중에 증가/감소
			
			int temp2 = 3;
			System.out.println(temp2-- + 2); // 5
		  // 뒤에 나오는 + 연산이 먼저 된 후, // 3 + 2 = 5
			// temp2 <= 2(1감소)
		}
			
			public void ex4() {
				//비교 연산자 : > , < , >= , <= , == , !=
				// - 비교 연산자의 결과는 항상 논리값(true/false)
				// - 등호(=)가 포함된 연산자에서 [등호는 항상 오른쪽!]
				
				// 같다 기호는?? == / =는 대입을 뜻함
				
				int a = 10;
				int b = 20;
				
				System.out.println(a > b); // false
				System.out.println(a < b); // true
				System.out.println(a != b); // true
				System.out.println((a == b) == false); // true
							// ()괄호안에 있는거 먼저 연산하니까
							// false == false --> true임
				
				int c = 4;
				int d = 5;
				
				System.out.println(c + 1 <= d); // true
				// 산술 연산자가 비교 연산자보다 우선순위가 높다
				
				int temp = 723;
				
				System.out.println(("temp는 짝수?") + (temp % 2 == 0));
				// 짝수인지 아닌지, 이용할떄 %와 같이 모듈러스를 이용해 바로 구분한다.
			}
	
				public void ex5() {
					// 논리연산자 : &&(AND), ||(OR) // <-(쉬프트 백슬래쉬)
					// && : 둘다 true이면 true
					
					int a = 101;
					// a는 100 이상이면서 짝수인가 ?
					System.out.println(a >=100); //true
					System.out.println(a %2 == 0); // false
					// (짝수인지 홀수인지 아는 모듈러스 %2 == 0)
					System.out.println((a >=100) && (a %2 == 0) );
					//false
					
					// || : 둘다 false면 false, (AND의 반대) 나머지 true
					
					int c = 10;
					// c는 10을 초과했거나 짝수인가?
					
					System.out.println((c > 10) || (c %2 == 0)); // true
					// 홀수인가? 하려면 %2 == 0
					
				}
					public void ex6() {
						// 논리부정연산자 : !
						// 논리값을 반대로 바꾸는 연산자
						
						boolean bool1 = true;
						System.out.println(!bool1);
						// !!! 느낌표는 맨 앞에 찍는다
					}
						public void ex7() {
						// 복합대입 연산자 : +=, -=, *=, /=, %=
						// -> 피연산자가 자신과 연산 후 결과를
						//	  다시 자기 자신에게 대입
							
						int a = 10;
						
						a++; // 11
						
						a += 4; // 15
						// a = a + 4;
						System.out.println("a += 4 :" +a);
						
						a -= 10;
						System.out.println("a -= 10 :" +a);
						
						a *= 3; // 30
						System.out.println("a *3= 3 :" +a);
						
						a /= 6;
						System.out.println("a /=6 :" +a);
						
						a %= 2;
						// 0
					}
						
						public void ex8() {
							// 삼항 연산자
							// 조건식 ? 식1 : 식2
							// 조건식의 결과에 따라서 식1이 수행될지, 2가 수행될지
							// 조건식 결과가 true 식1, false 식2
							
						int num = 30;
						String str1 = "num은 30보다 크다";
						String str2 = "num은 30 이하다";
						
						String result = num > 30? str1 : str2;
						System.out.println(result);
							
						}
						
					}
				
				
				
				
				
				