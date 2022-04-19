package com.javaex.practice3;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		System.out.print("숫자: ");
		double ex = sc.nextDouble();
		
		if (ex <= 0) {
			System.out.println( "계산결과는" + ((ex*ex*ex) - (9*ex) + 2) + " 입니다.");
		} else {
			System.out.println("계산결과는" + ((7*ex) +2) + " 입니다.");
		}
	sc.close();
	}
}
