package com.javaex.practice2;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금액: ");
		double income = sc.nextDouble();
		
		//금액별 범위
		double a = income *0.09;
		double b = 1000*0.09 + (income-1000)*0.18;
		double c = (1000*0.09) + (3000*0.18) + 0.27*(income -4000);
		double d =1000*0.09 + 3000*0.18 + (4000*0.27) + 0.36*(income-8000);
				
		//조건문
		if (income>=0 && income<=1000) {
			System.out.print("소득세는 " + a + "입니다.");
		} else if (income>1000 && income<=4000) {
			System.out.print("소득세는 " + b + "입니다.");
		} else if (income>4000 && income<8000) {
			System.out.print("소득세는 " + c + "입니다.");
		} else if (income>=8000){
			System.out.print("소득세는 " + d + "입니다.");
		} else {
			System.out.print("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}
}
