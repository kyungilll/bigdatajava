package java09;

public class 배열의복사 {

	public static void main(String[] args) {
		int[] num = {1,2,3}; // 배열(참조) >주소
		int num2 = 100; // 정수(기본) > 값
		
		//변수의 복사
		int num3 = num2;
		
		int[] num4 = num;
		System.out.println(num[0]);
		System.out.println(num4[0]);
		
		num[0] = 555;
		System.out.println(num[0]);
		System.out.println(num4[0]);
		//얕은복사

		System.out.println("---------");
		int[] num5 = num.clone(); //배열을 완벽하게 복사
		num[0]=999;
		System.out.println("num[0] = " + num[0]);
		System.out.println("num5[0] = " + num[0]);
	}

}
