package java17;

public class StudentUser {

	public static void main(String[] args) {
		
		StudentElement ele = new StudentElement();
		StudentMiddle mid = new StudentMiddle();
		StudentHigh hig = new StudentHigh();
		
		ele.study();
		ele.grade = 1;
		ele.scout = 2;
		hig.goal();
		hig.study();
		mid.study();
		
	}
	
	
}
