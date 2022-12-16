package edu.kh.oop.practice.model.vo;

public class Book {
		
	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명
	
	// 위 필드에 생성자를 선언함 }
	
	
	public Book() {} // 기본 생성자 ( + Book() )
	// 1. alt + shift + s
	// 2. using field
	
	
	public Book(String title, int Price,
			Double discountRate, String author) {
		// 매개변수 생성자
		
			this.title = title;
			this.price = Price; 
			this.discountRate = discountRate;
			this.author = author;
		// 매개변수 생성자 끝
	}
	
	// toString overloading 하는 순서 시작 ★ 해야함
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	// @override
	public String toString() { // 문자열을 리턴함 // 문제에 제시되어있어서ㅠ
		return title + " / " + price + " / "
				+ discountRate + " / " + author; //
		//// 메서드 기본 형 // 값 얻어오기 // 이 전체를 String 값으로 받는다
	}
}