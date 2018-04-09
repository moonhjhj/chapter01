package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;

		System.out.println((a > b) && (a < b)); // false true ==> false
		System.out.println((a > b) && (a > b)); // false false ==> false

		System.out.println("===============================");

		System.out.println((a > b) || (a < b));//false true ==> true

	}

}
