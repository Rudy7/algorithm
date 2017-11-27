package com.bit.opcode;
import java.util.Scanner;
public class Ssn {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "", num = "",result = "",test = "";
		String[] arr = {"name","num"
				       ,"학생의 이름을 입력해주세요."
				       ,"학생의 주민번호를 -붙여서 입력해주세요."
				       ,"다시 입력하세요."
				       ,"남","여","외국인"
				       };
		boolean inputOK = true;
		System.out.print(arr[2]);
		name = s.next();
		System.out.print(arr[3]);
		num = s.next();
		char ch = num.charAt(7); 
		switch(ch){
			case '1': result = arr[5];
				break;
			case '2':
				result = arr[6];
				break;
			case '3':
				result = arr[5];
				break;
			case '4':
				result = arr[6];
				break;	
		    case '5':
		    	result = arr[7];
				break;
		    case '6':
		    	result = arr[7];
				break;	
			default :
				inputOK = false;
		}
			if(!inputOK){
				test = arr[4];
			}else {
				test = String.format("%s : %s : %s", name ,num, result);	
			}
			System.out.println(test);
	} 		
}

		
		
		
		
		
		
		
		
		
		
		
//		if(ch=='1'||ch=='3'){
//			result = gender[0];
//		}else if(ch=='2'||ch=='4'){
//			result = gender[1];
//		}else if(ch=='5'||ch=='6'){
//			result = gender[2];
//		}else {
//			System.out.println("다시 입력하세요.");
//		}
//		System.out.printf("%s : %s : %s", name,num,result);
//	}
//
//}
