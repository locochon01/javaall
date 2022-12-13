package edu.kh.variable.practice;

 public class CastingPractice1 {

	public static void main(String[] args) {
		
	int iNum1 = 10;
	int iNum2 = 4;

	float fNum = 3.0f;

	double dNum = 2.5;

	char ch = 'A';


	int a = (int) (dNum);
	
	   double b = (double) iNum1; // 변수에 대입되는 값 자체 b를, 10으로 지정
		    System.out.println( iNum1 - iNum2 * 2 );  // 2
	        System.out.println( a ); // 2
	        
	        System.out.println( iNum2 * dNum );  // 10.0
	        System.out.println( b ); // 10.0
	       
	        System.out.println( (iNum1-iNum2*2) + 0.5 ); // 2+0.5 출력
	        System.out.println( dNum ); // 2.5 그대로 출력
	       
	        System.out.println( (int)fNum ); // int 정수형으로 대입해, 원래의 소수점을 제외, 변환된 float fNum으로 표시
	        System.out.println( iNum1/(int)fNum ); //형변환 식은 +-*/ 대입식보다 먼저 실행됨
	       
	        System.out.println( iNum1 / fNum ); // 10 나누기 3 -> 3.333333
	        System.out.println( iNum1 / (double)fNum ); // double과 float은 나누는 구간이 다르기 때문에 3.3333333333
	       
	        System.out.println( 'A' ); // 'A' 문자열 그대로 표기
	        System.out.println( (int) 'A' ); // 대문자 A의 char 값은 65부터 시작
	        System.out.println( 'A' + iNum1 ); // 65+10
	        System.out.println( (char) ( 'A' + iNum1) ); // 0 포함 10까지의 수를 문자열로 환산 A(0)~K(10)
	       
	        
	        
	      }
}
