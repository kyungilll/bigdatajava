package 스태틱;

public class WorkerTest {

	public static void main(String[] args) {
		Worker wk1 = new Worker("임아무개","남",24);
		Worker wk2 = new Worker("김아무개","여",23);
		Worker wk3 = new Worker("박아무개","남",25);
		
		System.out.print("전체 직원수는? : ");
		System.out.println(Worker.wcount + "명");
		System.out.print("직원들의 평균 나이는? : ");
		System.out.println(Worker.agesum/Worker.wcount + "살");
		System.out.println("전체 직원의 이름 출력");
		
			System.out.println(wk1);
			System.out.println(wk2);
			System.out.println(wk3);
	}
}
