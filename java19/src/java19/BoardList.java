package java19;

import java.util.HashMap;

public class BoardList {

	public static void main(String[] args) {
		HashMap list = new HashMap();
		
		Board b1 = new Board("안녕","안녕","1번","1234");
		Board b2 = new Board("ㅎㅇ","ㅎㅇ","2번","1234");
		Board b3 = new Board("ㅎㅇㅎㅇ","ㅎㅇㅎㅇ","3번","1234");
		
		list.put(100, b1);
		list.put(200, b2);
		list.put(300, b3);
		
		System.out.println(list);
	}
}
