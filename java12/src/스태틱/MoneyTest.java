package 스태틱;

public class MoneyTest {

	public static void main(String[] args) {
		
		Money money1 = new Money("김아무개",15);
		System.out.println(money1);
		Money money2 = new Money("김아무개2",5);
		System.out.println(money2);
		
		System.out.println(money1.name + "는 " + money1.play());
		System.out.println(money2.name + "는 " + money1.tv());
		
		System.out.println("지갑에는 " + Money.money + "원이 남아있습니다.");
	}
}
