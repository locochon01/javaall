package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice2 {

	public void practice2() {}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		
		
		int sum = (korean + math + english);
		
		float average = (korean + math + english);
		
		
		
		if(korean > 40 || math > 40 || english > 40
				&& average > 60) {
			
			System.out.println("불합격입니다."); }
	    else { 
	    	System.out.println("합격입니다."); }
	}
}