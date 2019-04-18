package control;

public class IfTest1 {

	public static void main(String[] args) {
		
		int food = 3; //1번으로 입력했다고 가정
		
		 // if 뒤에는 반드시 조건을 쓴다
		 // 조건의 결과는  boolean(논리형 T/F)
		if (food == 1) { 
			System.out.println("당신은 짜장면을 선택하셨군요.");
		} else if(food == 2){
			System.out.println("짬뽕을 선택");
		} else if(food == 3){
			System.out.println("우동을 선택");
		} else {
			System.out.println("다시 선택하세요.");
		}
	} //main end.

} // class end.

//  () > 함수의 입력값
//  {} > 포함, 묶어주는 역할
// 	[] > 배열
//  <> > 제네릭 프로그래밍
