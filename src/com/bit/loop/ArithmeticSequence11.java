package com.bit.loop;

public class ArithmeticSequence11 {
	public static void main(String[] args) {
/*
Algorithm 11번 문제 
1-2+3-4+5-6...+99-100 의 합계		
*/			
		String str = "";
		int res = 0; 
		for(int i = 1; i<=100; i++) {
			if(i%2==1) {
				str += i + "-";
				res += i;
			}else if(i%2==0) {
				if(i != 100){
					str += i + "+";
				}else{
					str += i + "=";
				}
				res -= i;
		     }
			}
		System.out.print(str + res);
	}
}
