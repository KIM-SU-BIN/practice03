package com.javaex.practice3;

public class Ex15 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i);
			}
		}
	}
}
