package 배열;

import javax.swing.JButton;

public class 스트링배열 {

	public static void main(String[] args) {
		int[] ages = {50, 100, 10};
		String[] names = {"홍길동","박길동","김길동"};
		//String 은 각 char들의 배열
//		JButton b1 = new JButton();
//		String[] buttons = new JButton();
		//b1 > 참조형 변수
		
		names[2] = "김동길";
		names[names.length-1] = "김동순";
		//변경
		
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		for (int i = 0;  i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String name : names) {
			//name 은 임시변수
			System.out.println(name);
			//names  배열에 있는 값들을 하나씩 name에 넣어줌(반복)
			//foreach
			//인덱스가 없기에 몇개만 고를경우 사용불가
		}
		for (int i : ages) {
			System.out.println(i);
			// i 는 임시변수
		}
	}

}
