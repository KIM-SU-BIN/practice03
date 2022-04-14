package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("상품가격:" );
		double a = sc.nextInt();
		System.out.print("받은돈:" );
		double b = sc.nextInt();
		
		System.out.println("받은돈:" + b);
		System.out.println("상품가격:" + a);
		System.out.println("부과세: " + a*0.1);
		System.out.print("잔액: " + (b-a) );
		
		sc.close();
		
	}

}
