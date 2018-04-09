package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		float c = 3.0f;
		System.out.println(a / b);
		System.out.println(a / c);

		// 자동형변환
		double dVar01 = 2 + 3.5;
		System.out.println(dVar01);

		// 강제형변환
		int i = (int) 1354437432.51354;
		System.out.println(i);

		// 확대변환
		double dVar02 = (double) 100; // 그냥 double만 써도 100.0으로 출력 but, 명시하기 위해 (double)붙여줌
		System.out.println(dVar02);

	}

}
