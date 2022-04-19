package com.javaex.practice3;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int star = sc.nextInt();

		for (int i = star; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}