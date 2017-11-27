package com.bit.opcode;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = {"+","-","*","/","%"
		,"첫번째 숫자를 입력하세요."
		,"두번째 숫자를 입력하세요."
		,"더하기는+, 빼기는-, 곱하기는*, 나누기(몫)은/, 나누기(나머지)는% 입력하세요."};
		int num1 = 0, num2 = 0, result = 0;
		String opcode = "";
		System.out.print(arr[5]);
		num1 = scanner.nextInt();
		System.out.print(arr[6]);
		num2 = scanner.nextInt();
		System.out.print(arr[7]);
		opcode = scanner.next();
		if(opcode.equals(arr[0])){
			result = num1 + num2;
		}else if(opcode.equals(arr[1])){
			result = num1 - num2;
		}else if(opcode.equals(arr[2])){
			result = num1 * num2;
		}else if(opcode.equals(arr[3])){
			result = num1 / num2;
		}else if(opcode.equals(arr[4])){
			result = num1 % num2;
		}else {
			System.out.println("잘못 입력 하셨어요.");
		}
		System.out.printf("%d %s %d = %d",
				         num1, opcode, num2, result);
		
									
	   }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		Scanner scanner = new Scanner(System.in);
//		int num1 = 0, num2 = 0, result = 0;
//		String opcode = "";
//		System.out.println("첫번째 숫자를 입력하세요.");
//		num1 = scanner.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.");
//		num2 = scanner.nextInt();
//		System.out.println("더하기는 + , 빼기는 - , 곱하기는 *, 나누기(몫)은 /  치고 엔터치세요");
//		opcode = scanner.next();
//		if(opcode.equals("+")){
//			result = num1 + num2;
//		}else if(opcode.equals("-")){
//			result = num1 - num2;
//		}else if(opcode.equals("*")) {
//			result = num1 * num2;
//		}else if(opcode.equals("/")) {
//			result = num1 / num2;
//		}else {
//			System.out.println("잘못 입력 하셨습니다. 다시 입력 해주세요.");
//		}	
//		System.out.println(num1+" "+opcode+" "+num2+" = "+result);
//			
//		
//	}	
//}
		
		
//		Scanner s = new Scanner(System.in);
//		int a = 0, b = 0, c = 0;
//		System.out.println("첫번째 숫자를 입력하세요.");
//		a = s.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.");
//		b = s.nextInt();
//		c = a + b;
//		System.out.println("a+b=" + c + "입니다.");

