package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice4 {

	public void practice4() {}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double height = sc.nextDouble();
		System.out.print("키(m)를 입력해 주세요");
		double weight = sc.nextDouble();
		System.out.print("몸무게(kg)을 입력해 주세요");
		double bmi = (weight / height * height);
		
		String result = "체중";
		
			if(bmi < 18.5) {
				result = "저체중";
			} else if (bmi > 23 && bmi < 25) { 
				result = "과체중";
			} else if (bmi >= 18.5 && bmi < 23) {
				result = "정상체중";
			} else if (bmi >= 25 && bmi < 30) {
				result = "비만";
			} else if ( bmi >= 30 ) {
				result = "고도비만";
			}
			
			System.out.print(bmi);
			System.out.print(result);}

	/* run 콘솔 실행이 안됩니다ㅠㅠㅠㅠ
	 */
}