package com.javaex.practice3;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 0; i <= num; i++) {
			sum += i;
		}

		System.out.print("합계: " + sum); // 보이게 작성?
		sc.close();
	}
}
