package com.javaex.ex03;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		
		int gugudan = sc.nextInt();
		
		for( int i = 1; i <= 9; i++) {
			System.out.println(gugudan + " * " + i + " = " + gugudan*i);
		}
		sc.close();

	}

}
