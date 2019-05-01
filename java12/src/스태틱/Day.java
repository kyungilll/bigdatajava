package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	
	static int sumtime; //총 시간
	static int count; //실행한 날 카운트
	
	//파라메터 만들때는 기본생성자 함께 만듦
	public Day() {
		
	}
	
	public static int getTotal() {
		return sumtime; 
		//스태틱 매소드는 매소드 내 사용되는 멤버변수는 반드시 스태틱 매소드여야 함 
	}
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sumtime = sumtime+time;
	}
	
	@Override
	public String toString() {
		return " [할 일=" + doing + ", 시간=" + time +"시간, 장소=" + location + "]";
	}
}
