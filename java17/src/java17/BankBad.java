package java17;

import java.io.ObjectInputStream.GetField;

public class BankBad extends Bank{

	public void getInterestGate() {
		rate = 10.0;
		grade = "Bad";
		System.out.println( grade +"BANK의 이자율 : " + rate);
	}
}
