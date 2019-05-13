package java19;

import java.util.HashMap;

public class MapTest2 {

	public static void main(String[] args) {
		
		HashMap memberList = new HashMap();
		
		Member m1 = new Member("kim",20, '남',"구로구","011");
		Member m2 = new Member("kim1",25, '여',"종로구","010");
		Member m3 = new Member("kim2",24, '남',"강남구","019");
		memberList.put("m100", m1);
		memberList.put("m200", m2);
		memberList.put("m300", m3);
		
		System.out.println(memberList);
		
	}
}
