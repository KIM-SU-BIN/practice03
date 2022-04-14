package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long speed = 30000;
	
		System.out.println("빛이 1년 동안 가는 거리는 " + (60*60*365*24*speed) + "km 입니다.");
		
		/*1년 동안의 빛의 거리 공식
		 *  (60sec * 60min * 365days * 24hour * speed) */
		sc.close();
		
	}

}
