package String테스트;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "i am a java";
		String s2 = "python";
		String n = "93013011";
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		// 문자열 중 특정 위치값만 가져오고 싶을 때
		System.out.println(n.charAt(6));

//		s1==s2 > 객체에 들어있는 주소값을 비교
		StringBuffer buffer = new StringBuffer("hello");
		System.out.println(buffer.charAt(0));

		System.out.println(s1.substring(1, 5)); // 1부터 5-1까지 가져옴
		System.out.println(s1.substring(5, 9));
		String[] result = s1.split(" ");
		// ""으로 구분지음
		// 리턴값 > 스트링배열
		System.out.println(result.toString());
		System.out.println(result[0]);
		for (String s : result) {
			System.out.println(s + " ");
		}
		String s5 = "Hi, Good Morning!";
		String[] result2 = s5.split(" ");
		System.out.println(result2.length);
		for (String s : result2) {
			System.out.println(s);
		}
		System.out.println("-------------------------");
		String[] result3 = s5.split(",");
		System.out.println(result3.length);
		for (String s : result3) {
			System.out.println(s);
		}
		System.out.println("-------------------------");
		String s6 = "Hi. Good Morning!";
		String[] result4 = s6.split("[.]"); // 점만 대괄호[] 사용
		System.out.println(result4.length);
		for (String s : result4) {
			System.out.println(s);
		}
		
		System.out.println(s6.indexOf("Good")); //  Good의 시작 인덱스를 알려줌
		
		String s7 = "http://www.naver.com/member/index.jsp";
		System.out.println(s7.lastIndexOf("/")); // 마지막 /의 위치를 가져옴
		System.out.println(s7.substring(s7.lastIndexOf("/")));
		
		System.out.println(s6.toUpperCase()); //모두 대문자로 바뀜
		System.out.println(s6.toLowerCase()); //모두 소문자로 바뀜
		
		String s66 = s6.replaceAll("Good", "best"); //바꾼 문자열을 리턴
		System.out.println(s66);
		char[] result6 = s6.toCharArray(); //한글자 씩 모두 캐릭터 배열로 바꿔 줌
		for (char c : result6) {
			System.out.println(c);
		}
		
		String s8 = "     hello!! win!!";
		System.out.println(s8.trim()); // 공백 없애기
		
		System.out.println(s8.concat("final")); // 문자열 붙이기
		
		System.out.println(s8.contains("win")); // 해당 문자열을 포함하고 있는지 여부
		String s9 = "winner class";
		System.out.println(s9.startsWith("winner"));
		System.out.println(s9.endsWith("class"));
		// 해당 문자열로 시작 혹은 끝나는지 여부
		
		
	}

}
