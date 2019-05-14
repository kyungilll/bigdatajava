package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test1 {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		String[] sd_str = {"y","yyyy","M","MM","d","dd","W","w","E","EEEE","h","hh","H","HH","m","mm","s","ss","S","a"};
		
		SimpleDateFormat sdf;
		
		for (int i = 0; i < sd_str.length; i++) {
			sdf = new SimpleDateFormat(sd_str[i]);
			System.out.println(sd_str[i]+" -> " + sdf.format(date));
		}
		
		SimpleDateFormat name1 = new SimpleDateFormat("hh");
		System.out.println(name1.format(date));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		date.setYear(15);
		
		System.out.println(date);
		
		String my_str = "1999-03-03";
		
		try {
			date = sdf.parse(my_str);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
