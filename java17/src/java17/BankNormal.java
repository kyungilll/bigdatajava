package java17;

import java.io.ObjectInputStream.GetField;

public class BankNormal extends Bank{

	
	public void getInterestGate() {
		rate = 5.0;
		grade = "Normal";
		System.out.println( grade +"BANK의 이자율 : " + rate);
	}
	
}
