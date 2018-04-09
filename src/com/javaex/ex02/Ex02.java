package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Scanner sc = new Scanner(System.in);    ==>외우셈(키보드 연결)
		int num = sc.nextInt(); ==>사용자 입력값 받아오기(int형)
		System.out.println(num);
		sc.close();*/
		
		/*Scanner sc = new Scanner(System.in); 이거 칠 떄 밑에꺼 항상 같이 쳐두기!!
		sc.close();*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		//System.out.println(num);
		System.out.println("입력하신 숫자는 " + num + " 입니다.");
		sc.close();
		
		
	}

}
