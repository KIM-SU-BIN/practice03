package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("마일을 입력하세요: ");
		double a = sc.nextDouble();
		
		System.out.print(a+ "마일은 " + a*1.609 + "킬로미터 입니다.");
		
		sc.close();
		
	}

}
