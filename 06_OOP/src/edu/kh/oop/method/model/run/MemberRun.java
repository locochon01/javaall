package edu.kh.oop.method.model.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {

//	[접근제한자] [예약어] 반환형 메서드명([매개변수])
	public static void main(String[] args) {
		MemberService service = new MemberService();
		service.displayMenu();
		
		
		// Memberservice의 기본생성자가 작성되어 있진 않지만
		// 문제 없이 사용가능 ( 컴파일러가 자동 생성 )
		
		// !!! 주의할 점
		// 생성자가 하나라도 있으면 기본 생성자 자동 생성을 안해준다.
		
		
	}

}
