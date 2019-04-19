package window;

import java.util.Date;

//계절판별
public class Ex3_2 {

	public static void main(String[] args) {
		Date date = new Date();
		String season = null;
		//null을 하지 않았다면 이전 (쓰레기값) > String x;
		//null을 넣어주면 (초기값) > String x = null;
		//다음 변수에 넣어주는 (대입값) > String x = "***";
		//변수의 상태 값 3가지 ★
		
		
		int month = date.getMonth();
		//getmonth 는 한달 적게 나오기 때문에 +1필요
		
		switch (month) {
		case 2: case 3: case 4:
			season = "봄";
			break;
		case 5: case 6: case 7:
			season = "여름";
			break;
		case 8: case 9: case 10:
			season = "가을";
			break;
		default:
			season = "겨울";
			break;
		}
//		if (month>=1 && month<4) {
//			season = "봄";
//		}else if (month>=4 && month<7) {
//			season = "여름";
//		}else if (month>=7 && month<10) {
//			season = "가을";
//		}else {
//			season = "겨울";
//		}
		
		System.out.println("지금은 "+(month+1) +"월, " + season + "입니다.");
	}

}
