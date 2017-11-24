package com.bit.opcode;
import java.util.Scanner;
public class CalcSwitch {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	String[] arr = new String[8];
	arr[0] = "+";
	arr[1] = "-";
	arr[2] = "*";
	arr[3] = "/";
	arr[4] = "%";
	arr[5] = "첫 번째 숫자를 입력하세요.";
	arr[6] = "사칙 연산 + , - , * , / 중 원하는 연산을 입력하세요";
	arr[7] = "두 번째 숫자를 입력하세요.";
	int num1 = 0, num2 = 0, result = 0;
	String opcode = "", test = "";
	boolean inputOK = true;
	System.out.print(arr[5]);
	num1 = s.nextInt();	
	System.out.print(arr[6]);
	opcode = s.next();	
	System.out.print(arr[7]);
	num2 = s.nextInt();
	switch(opcode){
		case "arr[0]":
			result = num1 + num2;
			break;
		case "arr[1]":
			result = num1 - num2;
			break;
		case "arr[2]":
			result = num1 * num2;
			break;
		case "arr[3]":
			result = num1 / num2;
			break;
		case "arr[4]":
			result = num1 % num2;
			break;
		default:
			inputOK = false;
		}
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner s = new Scanner(System.in);
//		int num1 = 0, num2 = 0, result = 0;
//		String opcode = "", test = "";
//		boolean inputOK = true;
//		System.out.print("첫 번째 숫자를 입력하세요.\n");
//		num1 = s.nextInt();
//		System.out.print("사칙연산 + , - , *, / 중 원하는 연산을 입력하세요.\n");
//		opcode = s.next();
//		System.out.print("두 번째 숫자를 입력하세요.\n");
//		num2 = s.nextInt();
//		switch(opcode){
//			case "+":
//				result = num1 + num2;
//				break;
//			case "-":
//				result = num1 - num2;
//				break;
//			case "*":
//				result = num1 * num2;
//				break;
//			case "/":
//				result = num1 / num2;
//				break;
//			default :
//				inputOK = false;
//				break;
//		}
//		if(!inputOK){
//			test = "사칙연산자만 입력 가능합니다.";
//		}else {
//			test = String.format("%d %s %d = %d", num1, opcode, num2, result);
//		}
//		System.out.print(test);
	

