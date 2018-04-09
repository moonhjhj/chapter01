package com.javaex.ex03;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요.");

		int gugudan = sc.nextInt();
		int i = 1;

		while (i <= 9) {
			System.out.println(gugudan + " * " + i + " = " + gugudan * i);
			i++;

		}
		sc.close();
	}
	

}
