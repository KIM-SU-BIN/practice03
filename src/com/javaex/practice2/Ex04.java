package com.javaex.practice2;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		
		int age = sc.nextInt();
		if (age>=19 && age<65) {
			System.out.print("1번 그룹");
		} else {	
			System.out.print("2번 그룹");
			}
		sc.close();
		
	}
}
