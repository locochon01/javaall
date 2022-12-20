package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		
		System.out.print("���� : ");
		String kind = sc.next();
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�� : ");
		String flavor = sc.next();
		System.out.print("���� : ");
		int numOf = sc.nextInt();
		System.out.print("���� : ");
		int price = sc.nextInt();
		
		
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		
		String result = sc.next();
		
		if(result.equals("y")) {
			System.out.println(	scr.confirmData() );
		
		} 

		
	}
}
