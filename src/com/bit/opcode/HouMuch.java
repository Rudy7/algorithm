package com.bit.opcode;

import java.util.Scanner;

public class HouMuch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int much = 0, num = 0, sum = 0, dc = 0;
		int total = 0;
		String result = "";
		String[] arr = {"얼마에요?", " 원입니다.", "몇개 드릴까요"," 개 드릴게요"
				       ,"총 금액은", "비싸요. 깍아주세요?", "몇 퍼센트 DC 할까요?"
                       ,"그럼", "원만 주세요.", "안 팔아요."};
		System.out.print(arr[0]);
		much = s.nextInt();
		System.out.printf("%s %d", arr[1], much);
		System.out.print(arr[2]);
		num = s.nextInt();
		System.out.printf(arr[3],num);
		sum = (much*num);
		System.out.printf(arr[4],sum,arr[9]);
		System.out.print(arr[5]);
		System.out.print(arr[6]);
		dc = s.nextInt();
		total = sum*(100-dc)/100 ;
		if(dc<10){
			System.out.println(arr[7] +total+ arr[10]);
		}else if(dc>=10) {
			System.out.println(arr[8]);
		}
	}
}	
		
		
//		switch(dc/10) {
//			case 0:
//				result = "그럼 total 원만 주세요.";
//				break;
//			default :
//				result = "안 팔아요.";
//				break;
//        }
		
		
//		//10퍼센트 이하이면
//		System.out.print("그럼 몇원만 주세요.");
//		//10퍼센트 이상이면
//		System.out.print("안 팔아요.");
//		System.out.print("475원 입니다.");
		



