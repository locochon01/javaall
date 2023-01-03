package edu.kh.array2.practice.service;

import java.util.Scanner;

public class PracticeService {

	public void practice7() {
		
		//행 열은 대각선으로 내려옴
		
		String Students[] = {"강건강", "남나나", "도대담", "류라라","문미미", "박보배", "송성실", "윤예의", "진재주", "차천축","피풍표", "홍하하"};
		
		String[][] arr = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int row = 0;
		int col = 0;
		
		System.out.println("======= 1분단 =======");
		for(int i = 0; i < Students.length; i++) {
			
			if(i < Students.length / 2) {
				arr[row][col] = Students[i];
				
				System.out.print(arr[row][col]);
				col++;
				
				if(col == arr[row].length) {
					row++;
					
					col = 0;
					
					System.out.println();
				}
				
			} else {
				arr2[row][col] = Students[i];
				
				System.out.print(arr2[row][col]);
				col++;
				
				if (col == arr2[row].length) {
					row++;
					
					col = 0;
					
					System.out.println();
					
				}
			}
			
			System.out.println("== 2분단 ==");
			
			if (i == Students.length / 2 / 1) {
				row = 0;
				col = 0;
				
				/* for(int i = 0; i < arr.length; i++) { // 행반복(0,1)
				for(int j = 0; j < arr[row].length; j++) { // 열 반복(0,1,2)
					arr[row][col] = Students[row];
				
				
				row++;
				}
			}
			
			for(int i = 0; i < arr2.length; i++) {
				for(int j = 0; j< arr[col].length; j++) {
					arr[row][col] = Students[col];
					
				}
			}
			
			System.out.println("======= 1분단 =======");

		}
				
				//arr[row][col] = num;
				//num += 10; // 10씩 증가
				*/
			}
		}
	}
		
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		String arr[][] = new String[6][6];
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	


	
	
	
			
		
		
		
		
}