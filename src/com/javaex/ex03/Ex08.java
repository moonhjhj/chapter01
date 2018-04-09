package com.javaex.ex03;

import java.util.Scanner;

//자바 1번파일 슬라이드 85
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요[0이면 종료]");
		int num;
		int sum = 0;

		while (true) {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계 " + " = " + sum);

			if (num == 0) {
				break;
			}
		}
		
		System.out.println("종료");
		sc.close();
		
		
		/*
		 * do { num = sc.nextInt(); // 그냥 while문만 쓰면 int num = sc.nextInt();를 두번 쓸 수 없기
		 * 때문에. sum = sum + num; System.out.println("합계 " + " = " + sum);
		 * 
		 * } while (num != 0); sc.close();
		 */
	}

}
