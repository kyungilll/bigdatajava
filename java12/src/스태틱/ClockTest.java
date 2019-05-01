package 스태틱;

public class ClockTest {
public static void main(String[] args) {
	
	Clock ck1 = new Clock(10000, "가가가", 15, "가나다회사");
	Clock ck2 = new Clock(20000, "나나나", 15, "나다가회사");
	
	System.out.println(ck1.getClass());
	System.out.println(ck2.getPrice());
	System.out.println(ck1.getCompany());
	
}
}
