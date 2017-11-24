package com.bit.opcode;

import java.util.Scanner;

public class GradeReport {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = new String[6];
		arr[0] = "학점";
		arr[1] = "평균";
		arr[2] = "이름?";
		arr[3] = "국어점수?";
		arr[4] = "영어점수?";
		arr[5] = "수학점수?";		
		int kor = 0, eng = 0, math = 0, avg = 0;
		String name = "", grade = "", c = arr[0], d = arr[1];
		System.out.print(arr[2]);
		name = s.next();
		System.out.print(arr[3]);
		kor = s.nextInt();
		System.out.print(arr[4]);
		eng = s.nextInt();
		System.out.print(arr[5]);
		math = s.nextInt();
		avg = (kor+eng+math)/3;
		switch(avg/10){
			case 10:
			case 9:
				grade = " A ";
				break;
			case 8:
				grade = " B ";
				break;
			case 7:
				grade = " C ";
				break;
			case 6:
				grade = " D ";
				break;
			case 5:
				grade = " E ";
				break;
			default:
				grade = " F ";
				break;
		}		
		System.out.printf("%s [%s] %d,  [%s] : %s %s",
				         name, d, avg,  c, grade, c );
				
				
//		if(avg>90) {
//			grade = "A"
//		}else if(avg>90) {
//			grade = "B"	
//		}else if(avg>90) {
//			grade = "C"	
//		}else if(avg>90) {
//			grade = "D"	
//		}else if(avg>90) {
//			grade = "E"	
//		}else{
//			grade = "학사경고 입니다."
//		}
		
		
		
		
		
		
	}
}
