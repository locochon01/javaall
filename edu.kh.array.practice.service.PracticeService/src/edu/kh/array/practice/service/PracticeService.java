package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {
	
	public void practice1() {
		
		////12/13 과제
		
		// 길이가 9인 배열을 선언 및 할당하고,
		int[] arr = new int[9];
		int sum = 0;
		
		// 1부터 9까지의 값을 반복문을 이용하여
		//순서대로 배열의 각 인덱스 요소에 대입하고
		for(int i = 0; i< arr.length; i++) {
			arr[i] = i+1;
			// 출력한 후
			System.out.print(arr[i]+" ");
			
			//짝수 번째 인덱스 값의 합을 출력하세요.
			if(i % 2 == 0) {
				sum += arr[i];
				//	sum = sum + arr[i]
			}
		}
		System.out.println();
		System.out.println(sum);

	}
	
	public void practice2() {
		//길이가 9인 배열을 선언 및 할당하고
		int[] arr = new int[9];
		int sum = 0;
		
		//9부터 1까지의 값 반복문
		for(int i = 0; i > arr.length; i--) {
			arr[i] = i-1;
			// 출력한 후
			System.out.println(arr[i]+ " ");
			
			//홀수 번 째 인덱스 값의 합 출력
			if(i % 1 == 0) {
					sum += arr[i];
					// sum = sum + arr[i]
					System.out.println(sum);
			}
			
		}
	}
}