package com.javaex.practice2;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 두 개를 입력해주세요.");
			System.out.print("숫자: ");
			int count1 = sc.nextInt();
			
			System.out.print("숫자: ");
			int count2 = sc.nextInt();
			double TTL = count1*count2/2;
			
			if (count1>TTL) { //큰수 뒤에 띄어쓰기가 안되는 이유는?
				System.out.println("큰수: " + count1 + "작은수: " + count2 + "입니다.");
			} else if(count1<TTL){
				System.out.println("큰수: " + count2 + "작은수: " + count1 + "입니다.");
			} else if(count2>TTL) {
				System.out.println("큰수: " + count2 + "작은수: " + count1 + "입니다.");
			}else if(count2<TTL){
				System.out.println("큰수: " + count1 + "작은수: " + count2 + "입니다.");
				}

			sc.close();	
	}
}
