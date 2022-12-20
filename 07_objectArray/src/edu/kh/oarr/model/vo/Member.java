package edu.kh.oarr.model.vo;

public class Member {
	// 필드 (== 멤버 변수) 
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region; // 지역(서울,경기,충북,전남..)

	

	// 생성자
	// 생성자 규칙
	// 1. 생성자 이름은 클래스 명과 같아야 한다.
	// 2. 반환형이 없다.
	public Member() {} // 기본생성자

	// 매개변수 생성자
	// alt + shift + s 
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	
	}
	
	// 메소드
	// getter/setter
	// alt + shift + s
	
	// 다 접근 가능하도록 public
	// String 자료형 돌려보내겠다.
	// 매개변수가 없어서 중복된 이름의 memberId가 없기 때문에 memberId라고만 써도 된다.
	
	public String getMemberId() { // 돌려보내는 역할이라 매개변수 X
		return memberId; // 호출한 곳으로 돌려보내는 역할
		// this를 안 쓰는 이유 : 겹치는 애가 없음
	}
	
	/* setter는 말 그대로 세팅하는애
	 * 무엇을 세팅할지 전달받아올 아이가 필요합니다 ==> 매개변수
	 * setter는 보통 반환 값은 없음 => void
	 */
	public void setMemberId(String memberId) { 
		this.memberId = memberId;
		// 모든 메서드는 종료 시 호출한 곳으로 돌아가는
		// return 구문이 작성되어야 하지만 단, void 일 때 생략 가능하다.
		// -> 생략 시 컴파일러가 자동 추가 => return;
	}	

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	

}
