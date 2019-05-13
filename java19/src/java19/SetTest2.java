package java19;

import java.util.HashSet;

public class SetTest2 {

	public static void main(String[] args) {
		
		HashSet set1 = new HashSet();
		set1.add("사과");
		set1.add("우유");
		set1.add("바나나");
		HashSet set2 = new HashSet();
		set2.add("빵");
		set2.add("요플레");
		set2.add("아이스크립");
		
		set1.addAll(set2); // set1에 set2를 결합
		
		System.out.println(set1);
		
		set2.clear(); // 지움
		System.out.println(set2);
	}
}
