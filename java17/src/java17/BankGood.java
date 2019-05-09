package java17;

import java.io.ObjectInputStream.GetField;

public class BankGood extends Bank{


	public void getInterestGate() {
		rate = 2.0;
		grade = "Good";
		System.out.println( grade +"BANK의 이자율 : " + rate);
	}
}
