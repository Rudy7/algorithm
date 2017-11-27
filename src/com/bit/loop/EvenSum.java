package com.bit.loop;

public class EvenSum {
	public static void main(String[] args) {
		String str = "";
		int evenSum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				if(i != 100) {
					str += i + "+"; 
				}else {
					str += i + "=";
				}
				evenSum += i; 
			}
		}
		System.out.print(str + evenSum);
	}
}	
//int oddS = 0;
//String str = "";
//for(int i = 1; i<100; i++){
//	if(i%2 == 1) {
//		if(i != 99) {
//			str += i + "+"; 
//		}else {
//			str += i + "=";
//		}	
//		oddS += i;
//	}
//}
//System.out.print(str + oddS);
//}
//}




//		int s = 0;
//		for(int i=1; i<=99; i++) {
//			if(i%2==0) {
//			s += i;
//			}
//	   }
//		System.out.print(s);
//	}
//}
//
