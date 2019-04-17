package data;

public class DataTest {

	public static void main(String[] args) {
		// comment, 주석(설명) , ctrl+/
		//sysout, syso + ( CTRL+스페이스바): 자동완성
		System.out.println("나의 데이터 프린트.."); //문자열은 스트링사용
		// 컨트롤+s (저장)
		// 컨트롤+F11 (실행)
		
		int spaceY = 300; 
		// int 값을 넣을만큼 공간을 지정 -21억 ~ +21억
		// bite(1바이트,8비트 [1과 0 여덟개가 모인것] -2^7 ~ +2^7), 
		// short(2)
		// int(4) *보통 인트를 사용할 것
		// long(8)
		// 숫자는 아무 기호도 쓰지 않음 , 등호오른쪽을 계산하여 왼쪽에 집어넣음
		// ex. 300+200=x (불가)
		
		int startX = 0; //대입연산자, 할당연산자
		int startY = 0;
		
		int result = startX + startY;
		String result2 = "그래픽의 시작점 Y축은"+ startY;
		
		System.out.println("그래픽의 시작점 X축은"+ startX);
		System.out.println(result2);
		
		System.out.println();
		
		float x = 5.5f;//작은소수점, f를 써줘야 인식됨 / 4바이트
		double y = 5.5; //8바이트
		
		char gender = '남'; //한 글자쓸 때는 '' 
		boolean breakTime = true; 
		//낙타표기법으로  Time만 앞에 대문자
		// 어떤것을 논리적으로 판달할 때 (Y/N) 1바이트 
		// 1비트만 필요하지만 자바에서 최소단위는 바이트
		// 0이나 1을 쓰지 않음
	}

}
