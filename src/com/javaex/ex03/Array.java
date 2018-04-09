package com.javaex.ex03;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 2;
		intArray[4] = 55;
		/*
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		*/
		for(int i = 0; i<intArray.length; i++) {   //intArray.length ==>배열 길이 수정할 때 일일이 여기도 수정하기 어려우니까 그냥 배열 길이 자체를 i변수의 범위로 설정해버리긔
			System.out.println(intArray[i]);
		}
		

	}

}
