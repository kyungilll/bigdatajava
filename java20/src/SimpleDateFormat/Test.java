package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		// 내 생일을 입력받아
		// 다가올 내 생일의 생일날짜를 출력하시오
		
		Date now = new Date();
		
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		
		System.out.println(sdf.format(now));
		
		String birth = "05-13";
		
		
		Date birth1 = new Date();
		try {
			birth1 = sdf.parse(birth);
			System.out.println(now.getTime());
			System.out.println(birth1.getTime());
			System.out.println(sdf.format(birth1));
			
//			answer = sdf.format(now)-sdf.format(birth1); 
			long x = now.getTime()-birth1.getTime();
			long xx = x/(24*60*60*1000);
			System.out.println(xx);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
