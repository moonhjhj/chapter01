package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 점수는?! : ");
		int point = sc.nextInt();

		if (point >= 60) {
			System.out.println("합격입니다");

		} else if (point > 30) {
			System.out.println("불합격입니다");
		} else {
			System.out.println("바보야 꺼졍");
		}

		sc.close();
		
	}

}
