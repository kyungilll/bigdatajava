package java19;

public class 형변환테스트1 {

	public static void main(String[] args) {
//형변환 > 타입변환, Casting
		
		//기초형 형변환
			//자동형변환 / 작은것 > 큰것에 넣을 때
			byte a = 127;
			int b = a;
			
			//큰 > 작
			int c = 127;
			// byte d = c;
			byte d = (byte)c; // 강제형변환
			
		//참조형 형변환(클래스의 형변환)
			//상속관계에 있는 클래스들만 형변환 가능
			//작>큰 : 자동형변환 (자식을 부모에 넣을 때) ----->업캐스팅
			
			
			//큰>작 : 강제형변환 (부모를 자식에 넣을 때) ----->다운캐스팅
			
			
		
	}
}
