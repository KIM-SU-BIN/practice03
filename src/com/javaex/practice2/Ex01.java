package com.javaex.practice2;

public class Ex01 {
	public static void main(String[] args) {
		int age = 15;
		
		// age가 0살 초과이고 18살 미만 이면
		// if(0< age < 18) 
			if(0< age || age< 18) { // 2가지의 조건을 사용하기 때문에 중간에 연결 고리(||,&& ect)가 있어야함!
			System.out.println("청소년입니다.");
		}
	}
}
