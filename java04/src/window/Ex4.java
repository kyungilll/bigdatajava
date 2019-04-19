package window;

import java.util.Date;

public class Ex4 {

	public static void main(String[] args) {

		Date date = new Date();
		
		int day = date.getDay();
		
				System.out.println(day);
		
		switch (day) {
		case 1:
			System.out.println("장소 1가기");
			break;
		case 2:
			System.out.println("장소 2가기");
			break;
		case 3:
			System.out.println("장소 3가기");
			break;
		case 4:
			System.out.println("장소 4가기");
			break;
		case 5:
			System.out.println("장소 5가기");
			break;
		case 6:
			System.out.println("장소 6가기");
			break;
		default:
			System.out.println("장소 7가기");
			break;
		}
		
	}

}
