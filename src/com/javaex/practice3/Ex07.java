package com.javaex.practice3;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for (int y=1; y<=num; y++ ) { //행
			for (int x=1; x<=y; x++ ) { //열 
				System.out.print(y);
			}
			System.out.println("");
		}
		sc.close();		
	}
}
