package com.bit.opcode;

import java.util.Scanner;

public class WhoAreYou {
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		String[] arr = new String[2];
		arr[0] = "당신의 이름은 무엇인가요?";
		arr[1] = String.format("아하 당신이 %s님 이군요.", "name");
		String name = "";
		System.out.print(arr[0]);
		name  = s.next();
		System.out.printf(arr[1]);
		
//		Scanner s = new Scanner(System.in);
//		String name = "";
//		System.out.println("당신의 이름은 무엇인가요?");
//		name = s.next();
//		System.out.println("저의 이름은 " + name + "입니다");
		
//		Scanner s = new Scanner(System.in);
//		String name = "";	
//		System.out.print("이름이 무엇인가요?");
//		name = s.next();
//		System.out.print("내 이름은" + name + "입니다.");
//		
//		Scanner s = new Scanner(System.in);
//		String name = "";
//		System.out.println("이름이 뭐에요? ");
//		name = s.next();
//		System.out.println("내 이름은 =" + name);
//	
		
	
	}

}
