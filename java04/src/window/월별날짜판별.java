package window;

import java.util.Date;

public class 월별날짜판별 {

	public static void main(String[] args) {

		Date date = new Date();
		
		int month = date.getMonth()+1;
		int day;
		int year = date.getYear()-118;
		
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("올해는" + (year+1900)+"년 "+month +"이며 31일까지 있는 달 입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("올해는" + (year+1900)+"년 "+month +"이며 30일까지 있는 달 입니다.");
			break;
		default:
			if (year==0) {
				System.out.println("올해는" + (year+1900)+"년 "+month +"이며 윤달 , 28일까지 있는 달 입니다.");
			}else {
				System.out.println("올해는" + (year+1900)+"년 "+month +"이며 29일까지 있는 달 입니다.");
			}
			break;
			//윤달
		}
		
	}

}
