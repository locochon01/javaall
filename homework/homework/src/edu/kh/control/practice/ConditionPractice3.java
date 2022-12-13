package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice3 {
	
	public void practice3() {}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		
		int month = sc.nextInt();
				
		int result = 0;
		
		
		
				switch(month) {
				
				case 1: case 3: case 5: case 7:case 8: case 10: case 12 :
					month = 31; break;
				
				case 2: case 4: case 6: case 9: case 11:
					month = 30; break;
				
				default : System.out.println("99월은 잘못 입력된 달입니다.");
				}
		}
}