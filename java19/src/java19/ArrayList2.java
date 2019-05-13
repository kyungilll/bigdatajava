package java19;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는스트링"); // 스트링(자식)> object(부모) --> 업캐스팅
		list.add(100);
		System.out.println(list);
		String name = (String)list.get(0); // object > string ---> 다운캐스팅 / 강제형변환
		
		
		
		
		
		
	}
}
