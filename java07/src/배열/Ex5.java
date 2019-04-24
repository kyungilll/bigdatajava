package 배열;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
	int[] num = {66,77,88,99};
	int max = 0; //최대값을 저장할 변수
	
	for (int i = 0; i < num.length; i++) {
		if (num[i]>max) {
			max = num[i];
		} 
	}
	System.out.println(max);
	}
}
//입력된 값 중 최댓값 찾기
//알고리즘

