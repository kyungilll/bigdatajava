package window;

import java.util.Date;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 영어로 굿에프터눈, 굿모닝, 굿이브닝, 굿나잇 자동으로 인사가 나오게끔
		
		Date date = new Date();
		
		int hour = date.getHours();
		if (hour<12) {
			System.out.println("굿모닝");
		} else if (hour<17) {
			System.out.println("굿에프터눈");
		} else if (hour<20) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
			
	}

}
