package window;

import java.util.Date;

public class 날짜테스 {

	public static void main(String[] args) {
	Date date = new Date();
	int hour =date.getHours();
	int min =date.getMinutes();
	int sec =date.getSeconds();
	System.out.println("현재 시각은 " + hour + "시"+ min +"분"+sec +"초 입니다.");
	}

}
