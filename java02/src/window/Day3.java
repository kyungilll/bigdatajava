package control;

public class Day3 {

	public static void main(String[] args) {

		//main > 컨트롤 스페이스
		/* 오늘 아침에 대한 정보 출력(변수에 저장해서 출력)
		 * 
		 * -------------------
		 * 오늘 아침을 먹고 왔나요? true
		 * 오늘 타고 온 버스나 지하철 노선은: 2호선
		 * 오늘은 어제(10.5)보다 5.5도 낮아요. 오늘의 온도는 :9
		 * 오늘부터 프로젝트를 함께할 조원은 : 홍길동 
		 */
		boolean bf = true;
		String tr = "1호선";
		double tem1 = 10.5;
		double tem2 = 1.4;
		double tem3 = tem1 - tem2;
		//한 가지라도 실수일 경우에는  double 사용
		String name = "홍길동";
		
		System.out.println("오늘 아침을 먹고 왔나요? : "+ bf);
		System.out.println("오늘 타고 온 버스나 지하철 노선은? : "+ tr);
		System.out.println("오늘은 어제("+tem1+")보다 "+tem2+"도 낮아요. 오늘의 온도는 :"+ tem3);
		System.out.println("오늘부터 프로젝트를 함께할 조원은 : "+ name);
		
	}

}
