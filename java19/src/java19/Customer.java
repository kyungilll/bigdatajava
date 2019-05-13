package java19;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer {
	public static void main(String[] args) {
		HashMap customer = new HashMap();
		customer.put(100, "김데이");
		customer.put(200, "김사전");
		customer.put(300, "김구조");
		customer.put(400, "김자료");
		
		System.out.println(customer);
	
		customer.remove(200);
		customer.put(300, "김충성");
		
		System.out.println(customer);
	}
}
