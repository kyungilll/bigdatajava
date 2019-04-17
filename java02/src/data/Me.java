package data;

public class Me {

	public static void main(String[] args) {
		// 컨트롤+d 한줄삭제
		String name = "정경일"; // 두 글자 이상이기에 "", String(대문자)사용
		char gender = '남'; // 한 글자라서 char, ''
				
		int age = 27;
		int tall = 170;
		int weight = 60; 
		double sight = 1.2; //소숫점이기에 double 사용
		
		System.out.print("나의 이름은 "+ name +"이고 ");
		System.out.println("나이는 "+age+"입니다.");		
		
		System.out.print("나의 키는 "+tall+"이고,");
		System.out.println("몸무게는 "+weight+"입니다.");
		System.out.println("시력은 "+sight+"입니다");

	}

}
