package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	
	public SnackController() {} // �⺻������
	
	// �����͸� setter�� �̿��Ͽ� �����ϰ�, ����Ϸ� ��� ��ȯ�ϴ� �޼ҵ�
	public String saveData(String kind, String name, String flavor, 
			int numOf, int price) {
		s.setKind(kind);
		s.setFlavor(flavor);
		s.setName(name);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "���� �Ϸ�Ǿ����ϴ�."
				+ "\n������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n) : ";
	}
	
	public String confirmData() {
		// ����� �����͸� ��ȯ��
		return s.infomation();
		// s.infomation()
		// ==  kind +"(" + name + " - " + flavor +  ") " + numOf +"�� " + price+"��";
	}
}
