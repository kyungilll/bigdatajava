package java01;

import java.util.Scanner;

public class ���忹�� {

	public static void main(String[] args) {
		// ���忹�� 
		
				Scanner sc = new Scanner(System.in);
				int[] seat = new int[10]; // 1~10�� �ڸ��迭
				System.out.println("--------------------");
				for (int i = 0; i < seat.length; i++) {
					System.out.print(" " +(i+1));
				}
				System.out.println();
				System.out.println("--------------------");
				
				while(true) { //�����Է� ����
					
					System.out.print("������ �ڸ��� �Է��ϼ���. > ");
					int x = sc.nextInt()-1; //�ڸ��� 1������ ����
						if(x<0 || x>9) { //�� �迭�� ������ ��ġ�� ��쿡�� ������ (11�ԷºҰ�)
							System.out.println("���� �ڸ��Դϴ�.");
							System.out.println("1~10������ �ڸ��� �Է��ϼ���.");
							System.out.println();
						} else {
						
					
					if (seat[x]==1) {
						System.out.println("�ڡ��̹� ���ŵ� �ڸ��Դϴ�.�ڡ�");
					} else {
						seat[x]=1;
					}
					// ���Ű����� �ڸ����� ����
					
					int price = 0;
					for (int i = 0; i < seat.length; i++) {
						System.out.print(" "+seat[i]);
						price = price+seat[i];
					}
					System.out.println();
					System.out.println(price);
					System.out.println();
					System.out.println("�� Ƽ�ϰ� : " + price*10000 + "��");
						}
					
						}
					
					
				}// �����Է� ��
				
				
			}

		
