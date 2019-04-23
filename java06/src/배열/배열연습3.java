package 배열;

public class 배열연습3 {
	public static void main(String[] args) {
		
		int[] num = {444,666,777};
		// = int num[] 도 가능함
		// 배열의 첫 번째 값에 세 번째 값을 넣으시오
		num[0] = num[2];
		System.out.println(num[0]);
		System.out.println(num[2]);
		// 복사의 개념
		
		// 위치교환
		
		int num1 = 300;
		int num2 = 100;
		
		int a = num1; //a는 임시저장 장소
		num1 = num2; //num2의 값을 num1에 넣음
		num2 = a; //num2에 임시 저장했던 a 값을 넣음
		
		System.out.println(num1 +" "+ num2);
		
		
	}
}
