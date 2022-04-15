package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		//Q. 출력결과 예상하기
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2; // 앞에 ++있는 경우 항상 먼저 계산
		int b = y++ *2; // 뒤에 ++ 맨 마지막 계산
		
		System.out.println("a=" + a); // int a 값 : 2*2= 4 
		System.out.println("b=" + b); // 1*2=2
		System.out.println("x=" + x);  //2
		System.out.println("y=" + y);  //2  
		/* --->int y = 1; 수식이 중간에 있기 때문에 System.out.println("y=" + y); 값이 2가 됨
		 * 즉, int y = 1; 수식이 없었을 경우에는 int y = 1;에 의해 결과값은 1!! */ 
		
	}

}
