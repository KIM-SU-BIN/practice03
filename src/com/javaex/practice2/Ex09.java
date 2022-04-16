package com.javaex.practice2;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int first =sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int second =sc.nextInt();
		
		//1. 큰 수, 작은 수 선별  2. 약수 확인
		int min;
		int max;
		
		if (first>second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		
		if (max % min == 0) {
			System.out.print(min +" 는(은) " + max + "의 약수입니다.");
		} else {
			System.out.print(min +" 는(은) " + max + "의 약수가 아닙니다.");
		}
		
		sc.close();
	}
}
