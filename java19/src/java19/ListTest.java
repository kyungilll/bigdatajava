package java19;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는 스트링");
		list.add(100);
		
		int num = (Integer)list.get(1);
		list.add(11.22);
		list.add(true);
		MemeberDTO dto = new MemeberDTO("j","j","j","j");
		list.add(dto);
		
		list.remove(3); //삭제
		System.out.println(list); //tostring 오버라이딩 된 상태
		
		
	}
}
