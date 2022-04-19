//1. 입력한 수의 약수 구하기
//2. 입력한 수를 i로 나누었을 때, 나머지 값이 0이 되어야함.
//3. for (int 초기값; 조건식; 증감식) 
// - 초기값은 반복횟수를 세기 위한 변수/ 조건식은 반복/ 증감식은 반복횟수 무너뜨리기

package com.javaex.practice3;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt(); 

		for (int i = 1; i <= num; i++) { // 입력 받은 숫자만큼 반복
			if (num % i == 0) { // 입력받은 숫자와 i의 나머지가 0이면 i(약수) 출력
				System.out.println(i);
			}
		}

		sc.close();
	}
}