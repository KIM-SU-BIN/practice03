package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 원화를 입력하세요: ");
		double b = sc.nextDouble();
		
		System.out.println("받으실 달러는 " + b*8.12380);
		
		
		System.out.print("환전할 원화를 입력하세요: ");
		int a = sc.nextInt();
		
		System.out.print("받으실 달러는 " + a*1230.95);
		sc.close();
	}

}
