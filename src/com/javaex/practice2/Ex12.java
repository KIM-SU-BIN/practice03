package com.javaex.practice2;

import java.util.Scanner;

import javax.xml.crypto.dsig.SignatureMethod;

public class Ex12 {
	private static Object sign;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		String mark = sc.nextLine();	
			
		System.out.print("숫자1: ");
		double num1 =sc.nextDouble();
		
		System.out.print("숫자2: ");
		double num2 =sc.nextDouble();
		
		//mark 기호
		double plus = num1 + num2;
		double minus = num1 - num2;
		double mu= num1 * num2;
		double div = num1 / num2;
		
		if (sign.equals("+") ) {
			System.out.print("결과는: " + plus);
		} else if(sign.equals("-") ) {
			System.out.print("결과는: " + minus);
		} else if(sign.equals("*") ) {
			System.out.print("결과는: " + mu);
		} else if (sign.equals("/") ) {
			System.out.print("결과는: " + div);
		} else {
			System.out.print("계산할 수 없습니다.");
		}
		//마무리
		
		sc.close();
	}
}
