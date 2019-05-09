package java17;

public class BankUser {

	public static void main(String[] args) {
		
		BankBad bad = new BankBad();
		BankNormal normal = new BankNormal();
		BankGood good = new BankGood();
		
		bad.getInterestGate();
		good.getInterestGate();
	}
	
	
}
