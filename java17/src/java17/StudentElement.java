package java17;

public class StudentElement extends Student{

	int scout;
	
	public void study() { //재정의, 오버라이딩
		System.out.println("줄넘기 연습하다.");
	}
	public void football() {
		System.out.println("축구를 합니다.");
	}
	
}
