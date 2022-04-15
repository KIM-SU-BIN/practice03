package com.javaex.practice2;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.println("키: ");
		System.out.println("몸무게: ");
		
		double stature = sc.nextDouble();
		double TTL = (stature-100)*0.9;
		
			if(stature>TTL) {
				System.out.print("과체중입니다.");;
			}
			sc.close();
	}
}
