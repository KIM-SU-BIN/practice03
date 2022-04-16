package com.javaex.practice2;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int first =sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int second =sc.nextInt();
		
		if (first>second) {
			System.out.println("몫: " + first/second );
			System.out.println("나머지: " + first%second );
		} else if (first<second) {
			System.out.println("몫: " + second/first );
			System.out.println("나머지: " + second%first );
		} else {                                                         //값이 같을 경우 몫: 1 나머지 : 0
			System.out.println("몫: " + second/first );
			System.out.println("나머지: " + second%first );
		}
		sc.close();
		
	}
}
