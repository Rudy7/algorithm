package com.bit.opcode;

import java.util.Scanner;

public class HouMuch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int much = 0, num = 0, sum = 0, dc = 0;
		int total = 0;
		String result = "";
		String[] arr = new String[9];
		arr[0] = String.format("얼마에요?");
		arr[1] = "\" %d 원입니다. much";
		arr[2] = "\"몇개 드릴까요";
		arr[3] = "\" %d 개 드릴게요, num";
		arr[4] = "\"총 금액은 %d  입니다, sum";
		arr[5] = "\"비싸요. 깍아주세요?" ;
		arr[6] = "\"몇 퍼센트 DC 할께요?";
		arr[7] = "\"그럼 %d 원만 주세요. dc";
		arr[8] = "\"안 팔아요.";
		
		System.out.print(arr[0]);
		much = s.nextInt();
		System.out.printf(arr[1]);
		System.out.print(arr[2]);
		num = s.nextInt();
		System.out.print(arr[3]);
		sum = (much*num);
		System.out.print(arr[4]);
		System.out.print(arr[5]);
		System.out.print(arr[6]);
		dc = s.nextInt();
		total = sum*(100-dc)/100 ;
		if(dc<10){
			System.out.println(arr[7]);
		}else if(dc>=10) {
			System.out.println(arr[8]);
		}
	}
}	
		
		
//		switch(dc) {
//			case 9:
//				result = "그럼 total 원만 주세요.";
//				break;
//			default :
//				result = "안 팔아요.";
//				break;
		
		
		
//		//10퍼센트 이하이면
//		System.out.print("그럼 몇원만 주세요.");
//		//10퍼센트 이상이면
//		System.out.print("안 팔아요.");
//		System.out.print("475원 입니다.");
		



