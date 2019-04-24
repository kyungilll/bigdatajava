package 배열;

import java.util.Scanner;

public class 극장예매 {

	public static void main(String[] args) {
		// 극장예매 
		
				Scanner sc = new Scanner(System.in);
				int[] seat = new int[10]; // 1~10번 자리배열
				System.out.println("--------------------");
				for (int i = 0; i < seat.length; i++) {
					System.out.print(" " +(i+1));
				}
				System.out.println();
				System.out.println("--------------------");
				
				while(true) { //예매입력 시작
					
					System.out.print("예매할 자리를 입력하세요. > ");
					int x = sc.nextInt()-1; //자리는 1번부터 시작
						if(x<0 || x>9) { //★ 배열의 갯수와 일치할 경우에만 에러뜸 (11입력불가)
							System.out.println("없는 자리입니다.");
							System.out.println("1~10번까지 자리를 입력하세요.");
							System.out.println();
						} else {
						
					
					if (seat[x]==1) {
						System.out.println("★★이미 예매된 자리입니다.★★");
					} else {
						seat[x]=1;
					}
					// 예매가능한 자리인지 여부
					
					int price = 0;
					for (int i = 0; i < seat.length; i++) {
						System.out.print(" "+seat[i]);
						price = price+seat[i];
					}
					System.out.println();
					System.out.println(price);
					System.out.println();
					System.out.println("총 티켓값 : " + price*10000 + "원");
						}
					
						}
					
					
				}// 예매입력 끝
				
				
			}

		
