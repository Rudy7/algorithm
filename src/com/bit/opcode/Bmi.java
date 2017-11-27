package com.bit.opcode;

import java.util.Scanner;

/*  BMI = w/t*t
// 고도 비만 : 35 이상
// 중등도 비만 (2단계 비만) : 30 - 35
// 경도 비만 (1단계 비만) : 25 - 30
// 과체중 : 23 - 24.9
// 정상 : 18.5 - 22.9
// 저체중 : 18.5 미만
// bmi
// if(18.5 <= bmi < 22.9)  틀렸습니다.
// if(18.5 <= bmi && bmi < 22.9)
 홍길동님 정상(비만,저체중)입니다. 출력하게 하시오.
*/
public class Bmi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String res = "";
		int pers = 0; 
		System.out.print("몇 명이 오셨나요? ");
		pers = s.nextInt();
		for(int i = 1; i<pers+1; i++) {
		String name = "", result = "";
		double height = 0.0, weight = 0.0, bmi = 0.0;
		String[] arr = {"저체중 입니다.", "정상 입니다.", "과체중 입니다.", "경도 비만(1단계 비만) 입니다."
				       ,"중등도 비만(2단계 비만) 입니다.", "고도 비만 입니다.", "이름을 입력해 주세요."
				       ,"몸무게(kg 단위)를 입력해 주세요.", "키(M 미터단위)를 입력해 주세요.", "다시 입력해주세요.", "님"};
		System.out.print(arr[6]);
		name = s.next();
		System.out.print(arr[7]);
		weight = s.nextDouble();
		System.out.print(arr[8]);
		height = s.nextDouble();
			bmi = (weight/height)/height;
			if(bmi<18.5) {
				result = arr[0]; 
			}else if(18.5 <= bmi && bmi < 23) {
				result = arr[1];
			}else if(23 < bmi && bmi < 25) {
				result = arr[2];
			}else if(25 < bmi && bmi < 30) {
				result = arr[3];
			}else if(30 < bmi && bmi < 35) {
				result = arr[4];
			}else if(35 < bmi) {
				result = arr[5];
			}else {
				result = arr[9];
			}
			res += i + String.format("%s %s %s \n", name, arr[10], result);	
    	}
		System.out.print(res);	
	}
}	

//		System.out.print("%s %s %s", name, arr[10], result);	
