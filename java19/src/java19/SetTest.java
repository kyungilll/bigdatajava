package java19;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		
		bag.add("휴지");
		bag.add("휴대폰");
		bag.add("지갑");
		
		System.out.println("내 가방 속 물건 개수는 " + bag.size() + "개");
		
		System.out.println(bag);
		
		bag.add("지갑"); // 중복된 값은 거른다 / 순서도 없다
		System.out.println(bag);
		
		System.out.println("지갑이 있나요? " + bag.contains("지갑")); // 자료유무여부 체크
		
		
	}
}
