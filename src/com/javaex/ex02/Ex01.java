package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String c2 = "한";
		
		String name = "히주니";

		System.out.println("안녕하세요");
		System.out.println(str);

		System.out.print("안녕");
		System.out.println("하세요");

		System.out.println(str + str);
		System.out.println(str + " " + i);
		System.out.println(str + d);

		System.out.println(c + c);
		System.out.println("제 이름은 " + name + " 입니다.");
		
		System.out.println("==============================");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println("안녕\"하\"세요");
		System.out.println("안녕\\하세요");

	}

}
