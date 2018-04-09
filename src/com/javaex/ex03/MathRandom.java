package com.javaex.ex03;

public class MathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// array 이용해서 lotto 짜보기( 45까지의 숫자 중 랜덤으로 6개 뽑기)
		int[] lottoNums = new int[6]; // lottoNums에는 주소가 들어가 있는것.

		for (int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = (int) (Math.random() * 45) + 1;
		}//값 넣는거

		for (int i = 0; i < lottoNums.length; i++) {
			System.out.println(lottoNums[i]);
		}//값 빼는거

	}

}
