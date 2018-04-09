package com.javaex.ex03;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("종료");
				break;
			}else if(num % 3 == 0) {
				System.out.println("3의 배수입니다");
				
			}else {
				System.out.println("3의 배수가 아닙니다");
			}
		}

		/*
		 * while(num == 0) { if(num % 3 == 0) { System.out.println("3의 배수입니다");
		 * 
		 * }else { System.out.println("3의 배수가 아닙니다"); } }
		 * 
		 */
		sc.close();

	}

}
