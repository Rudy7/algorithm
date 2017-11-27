package com.bit.loop;
// 1 ~ 100까지 홀수의 합 
// modular %
// 1 % 2 = 1
// 2 % 2 = 0
// 3 % 2 = 1
// 4 % 2 = 0
// 1 +3 + 5 +....+ 99 = ?  으로 출력시키기
public class OddSum {
	public static void main(String[] args) {
		int oddS = 0;
		String str = "";
		for(int i = 1; i<100; i++){
			if(i%2 == 1) {
				if(i != 99) {
					str += i + "+"; 
				}else {
					str += i + "=";
				}	
				oddS += i;
			}
		}
		System.out.print(str + oddS);
	}
}
//		String str = "";
//		int oddSum = 0;
//		for(int i=0; i<100; i++) {
//			if(i%2 == 1) {
//				if(i != 99) {
//					str += i + "+";
//				}else {
//					str += i + "=";
//				}
//				oddSum += i;
//			}else {}
//		}
//		System.out.print(str + oddSum);
//	}
//}
		
		
		
		
		
//		int s = 0;
//		for(int i=1; i<=99; i++) {
//			if(i%2==1) {
//				s += i;
////			}else {
////				s += i;
////			}
//			}
//		   }
//		System.out.print(s);
//		}
//}

