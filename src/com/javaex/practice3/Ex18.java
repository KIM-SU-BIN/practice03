//1. *이 많은 수 -> 적은 수 -> 많은 수
//2. for (int 초기값; 조건식; 증감식)  
// - 초기값은 반복횟수를 세기 위한 변수/ 조건식은 반복/ 증감식은 반복횟수 무너뜨리기
package com.javaex.practice3;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		//두 번 반복
		for (int y = num; y >= 0; y--) { //행
			for (int x =1; x <= y;  x++) {  //열 
				System.out.print("*");
			}
			System.out.println();
		}
		for (int y = 2; y <= num; y++) { //행
			for (int x =1; x <= y;  x++) {  //열 
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}