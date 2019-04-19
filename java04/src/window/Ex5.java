package window;

import java.util.Date;

public class Ex5 {

	public static void main(String[] args) {

		Date date = new Date();
		int year = date.getYear()+1900;
		int result = 2222-year;
		
		System.out.println("2222년이 될 때 까지 "+result +"년 남았습니다.");
		
		
	}

}
