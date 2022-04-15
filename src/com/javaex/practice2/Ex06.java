package com.javaex.practice2;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 두 개를 입력해주세요.");
			System.out.println("숫자: ");
			System.out.println("숫자: ");
			
			
			int count = sc.nextInt();
			double TTL = count*count/2;
			
			if (count>TTL) {
				System.out.println("큰수: ");
			} else {
				System.out.println("작은수: ");
			}

			sc.close();
		
	}
}
