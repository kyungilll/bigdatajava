package 스태틱;

public class 스트링연습 {
	public static void main(String[] args) {
		String s1 = " ";
		String s2 = "A";
		
		System.out.println(s1.charAt(0));
		
		//charAt > 인자1개, int, 반환값있음
		// 0번자리의 캐릭터를 반환 / 변수에 넣으려면 char 타입에 넣어야함
		
		System.out.println(s1.concat(s2));
		// 입력타입:스트링 / 인자2개 / 반환타입: 스트링
		// s1과 s2를 붙여줌
		
		System.out.println(s2.compareTo(s1));
		// 글자순으로 떨어진 개수
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		// 대소문자 무시하고 비교
		
		System.out.println(s1.isEmpty());
		// 비어있는지
		
		System.out.println(s1.length());
		System.out.println();
		
	}
}
