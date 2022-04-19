package com.javaex.practice3;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*초기 설정값
		int withdraw = 0; 
		int deposit = 0;
		*/
		int now = 0;  // 처음 시작은 0으로 해야 기입한 값이 계산됨!!
		
		while(true) {  //while은 (조건식)이 true인 경우에만 실행되고 false면 프로그램이 종료됨
			System.out.println("");
			System.out.println("===============================");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("===============================");
			System.out.print("선택> ");
		
			int n = sc.nextInt();
			
			if(n==4) {
				System.out.println("프로그램 종료");
				break;
			}else if(n==1) {
				System.out.print("예금액> ");
				int deposit = sc.nextInt();  //새로 입력한 값 input (입금이니까)
				now += deposit;  //현재 있는 값에서 더하기 입력값 (맨 위에 now=0)
			}else if(n==2) {
				System.out.print("출금액> ");
				int withdraw = sc.nextInt(); //output (출금이니까)
				now -= withdraw; // 현재 now는 위의 +를 한 번 거친 상태의 값. 즉, 위에서 입력을 3으로 했다면 0(now의 초기값) + 3 = 3(now)값이 되는 거임
			}else if(n==3) {
				System.out.println("잔고액> "+ now); // 잔고액이기 때문에 in/output 사용하지 않음
			}
			else {
				System.out.println("다시 입력해 주세요");
			}
		}
		sc.close();
		}
	}