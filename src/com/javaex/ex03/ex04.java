package com.javaex.ex03;


public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				continue;
			}else {
				
				System.out.println(i);
			}
		}

	}

}
