package com.javaex.practice3;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		// 행과 열의 수(위치) 변경하기
		for (int i = num; i >= 0; i--) { // 행
			for (int x = 1; x <= i; x++) { // 열
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
