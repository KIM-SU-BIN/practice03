package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("상품가격:" );
		double price = sc.nextInt();
		System.out.print("받은돈:" );
		double re = sc.nextInt();
		System.out.println("================");
		System.out.println("받은돈:" + re);
		System.out.println("상품가격:" + price);
		System.out.println("부과세: " + price*0.1);
		System.out.print("잔액: " + (re-price) );
		
		sc.close();
		
	}

}
