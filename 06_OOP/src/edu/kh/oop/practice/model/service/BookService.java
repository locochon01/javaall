package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() { // 4 class 구조
		
		// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
		
		Book book1 = new Book(); // 기본생성자
								//import 패키지껄로 하는거 유의
		
		// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		
		Book book2 = new Book("자바의 정석" , 30000 , 0.2 , "남궁성"); // 매개변수 생성자 이용하기
								//
		// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력
		System.out.println(book1.toString()); 
		System.out.println(book1.toString()); 
		System.out.println(book1.toString()); 
		System.out.println(book1.toString()); 
		System.out.println("========================"); 
		// 프린트 구문에 문자열을 전달 해 주는것을

		// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력
		System.out.println("수정된 결과 확인");
		System.out.println(book1.toString());
		System.out.println("========================");

		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
			// tip! 할인된 가격 = 가격 - (가격 * 할인율)
		System.out.printf("도서명 = %s\n", book1.getTitle());
		System.out.printf("할인된 가격 = %d\n" , (int)book1.getPrice() - book1.getPrice() - book1.getPrice());
		System.out.printf("도서명 = %s\n", book1.getTitle());
		System.out.printf("할인된 가격 = %d\n" , (int)book2.getPrice() - book2.getPrice() - book2.getPrice());
		// \ 개행
		
		
		
		
		
	}
}
