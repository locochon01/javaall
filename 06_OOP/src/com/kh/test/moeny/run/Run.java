package com.kh.test.moeny.run;

import com.kh.test.money.model.vo.Money;

public class Run {

	public static void main(String[] args) {

		Money test = new Money();
		test.setMoney(10000);
		test.print();
		
	}
}



// UNIT 대문자 : 상수 : FINAL로 만들어야 함
// 밑줄 : final static 참고해서 해야함