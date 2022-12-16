package edu.kh.oop.cls.model.vo;

public class User {
	// 필드
	// == 속성
	
	// 아이디, 비밀번호, 이름, 나이, 성별 -> 추상화 진행
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	// 생성자
	// 기본 생성자
	public User() {
		//기능
		System.out.println("기본 생성자로 User 객체 생성");
		
		// 필드 초기화
		userId = "user01"; // 이런식으로 전부 필드초기화 해주면 됨
		userPw = "pass02"; 
		userName = "홍길동";  // ""; 매개변수 생성자?
		userAge = 20; 
		userGender = 'M'; 
		
		//
	}
	
	// 매개변수 생성자
	// ** 사용되는 기술, 변수 : 매개변수, Overloading(오버로딩),this
	
	// ** 매개변수 : 생성자나 메서드 호출 시 () 안에 작성되어
	//				전달되어지는 값을 저장하는 변수
	//			-> 전달 받은 값을 저장하고 있는 매개체(지니고 있는) 역할의 변수				
	
	public User( String userId, String userPw ) {  /*매개변수*/
					// "asdf1234"		"12345"
			this.userId = userId;
			this.userPw = userPw;
			// - this 해서 쓰는 이유? 매개변수로 전달받은 값을, 필드에 초기화(this 참조변수)
			
			//*** this 참조 변수 ***
			// - 객체가 자기 자신을 참조할 수 있도록 하는 변수
			// - 모든 객체 내부에 숨겨져있음
			// - 왜 사용하는가??
			// 필드명과 매개변수명이 같을 경우
			// 이를 구분하기 위해서 주로 사용한다.
	}
	
	//필드를 전부 초기화 하는 목적의 매개변수 생성자
	
	public User(String userId, String userPw, String userName,
			int userAge, char userGender ) {
		// User(userId, userPw); // User는 본인을 3인칭으로 부르기 싫어함
		// this.userId = userId;
		// this.userPw = userPw;
		// System.out.println();

		this(userId,userPw); // this() 생성자
		// 같은 클래스의 다른 생성자를 호출할 때 사용
		// 생성자 내에 반드시 첫 줄에 작성되어야 한다
		
		// 사용이유?
		// 코드길이 감소, 재사용성 증가, 가독성 문제로 잘 사용하진 않음
		
		
		
		this.userAge = userAge;
		this.userName = userName;
		this.userGender = userGender;
		
	}
	
	// *자바*
	// 자바는 기본적으로 필드명, 생성자명, 메소드명, 변수명의 중복을 허용하지 않음
	
	// ** 오버로딩(Over loading) **
	// - 클래스 내 동일한 이름의 메서드(생성자 포함)를 여러 개 작성하는 기법
	// -> 하나의 이름으로 여러 기능을 수행할 수 있게한다.
	
	// [오버로딩 조건]
	// 1) 메서드 (생성자 포함)의 이름이 동일
	// 2) 매개변수의 개수, 타입, 순서 중 1개라도 달라야 함
	
	// public User() {} // 기본 생성자가 이미 작성되어 있어, 중복으로 인식함
	
	public User(String userId) {} // 매개변수의 개수가 같은 생성자가 없음
								// -> 오버로딩 성립O
	
	public User(int userAge) {} // 매개변수의 개수는 같지만, 타입이 다름
								// -> 오버로딩 성립O
	
	public User(String userId, int userAge) {}
	// 매개변수의 개수가 위에 같은것이 있으나, 매개변수의 타입이 다름
	// 오버로딩 성립
	
	public User(int userAge, String userID) {}
	// 매개변수의 개수&타입은 같으나, 매개변수의 순서가 다름
	
	// public User(int userAge, String userName) {}
	// id,name을 똑같다고 인식
	// 매개변수의 개수&타입&순서 모두 같아서 오버로딩 불가
	// -> 변수명은 신경쓰지 않는다.
	
	public User(String userId, String userPw, String userName) {}
	// public User(String userName, String userId, String userPw) {}
	
	// -> 들어오는 값이 똑같아 안됨
	
	
	
	
	
	
	
	
	
	
	// 메서드
	// 캡슐화로 인한 간접 접근 기능(getter/setter)
	
	// getter/setter 자동 완성
	// alt + shift + s -> Generate Getter and Setters
	
	public String getUserID() { // userID의 getter
		return userId;
	}
	
	public void setUserID(String userID) { // userID의 setter, 매개변수 들어가야함
		this.userId = userID;
	}
	
	
	
	public String getUserPW() {
		return userPw;
	}
	
	public void setUserPW(String userPW) {
		this.userPw = userPW;
	}
	
	
	
	public String getUserNAME() {
		return userName;
	}
	
	public void setUserNAME(String userNAME) {
		this.userName = userNAME;
	}
	
	
	public int getUserAGE() {
		return userAge;
	}
	public void setUserAGE(int userAGE) {
		this.userAge = userAGE;
	}
	
	
	public char getUserGENDER() {
		return userGender;
	}
	public void setUserGENDER(char userGENDER) {
		this.userGender = userGENDER;
	}
}