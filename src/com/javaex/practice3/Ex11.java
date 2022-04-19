package com.javaex.practice3;

import java.util.Scanner;

public class Ex11 { //소문자 이외 값 적용x
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc. nextInt();
		int sum =0;
		
		if(num%2==0) { //숫자가 짝수이면 ~
			for(int i = num; i >=0; i=2) {
			sum+= i;
			}
		} else if (num%2==1) { //홀수면~ 
			for(int i = num; i >=0; i=2) {
			sum+= i;
		}
	}
		System.out.println("결과값"+sum);  //짝수값만 더해라
		
		sc.close();
	}
}
