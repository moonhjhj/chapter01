package com.javaex.homework;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int input = sc.nextInt();
		int sum = 0;
		int i = 1;
		int j = 0;

		while(i <= input && j <= input) {
			if(input % 2 == 1) {
				sum += i;
				i += 2;
			}else {
				sum += j;
				j += 2;
			}
		}
		
		
		/*for (i = 1; i <= input; i += 2) {
			if (input % 2 == 1) {
				sum += i;

			}else {
				
			}

		}*/
		System.out.println(sum);
		sc.close();

	}

}
