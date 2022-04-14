package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨: ");
		double tem = sc.nextDouble();
		
		System.out.print("화씨: " + tem + "의 섭씨온도는 " + ((tem - 32)*5/9)+ "입니다.");

		sc.close();
		
	}

}
