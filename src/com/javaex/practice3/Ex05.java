package com.javaex.practice3;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.println("키: ");
		double stature = sc.nextDouble();
		
		System.out.println("몸무게: ");
		double weight = sc.nextDouble();
		
		double TTL = (stature-100)*0.9; //표준체중 공식
		
			if(weight>TTL) {
				System.out.print("과체중입니다.");
			} else if (weight<TTL) {
				System.out.print("저체중입니다.");
			} else {
				System.out.print("표준체중입니다.");
			}
			sc.close();
	}
}
