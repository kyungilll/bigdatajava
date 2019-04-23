package 배열;

public class Ex1 {

	public static void main(String[] args) {

		double[] sight = {1.0,1.1,1.2,1.4,1.7};
		for (int i = 0; i < sight.length; i++) {
			System.out.print(sight[i] + " ");
		}
		System.out.println("");
		char[] gender = {'남','남','여','여','여'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		
		System.out.println("");
		char[] grade = {'A','A','B','C','F'};
		for (int i = 0; i < grade.length; i++) {
			System.out.print(grade[i] + " ");
		}
		
		System.out.println("");
		String[] name = {"가가가","나나나","다다다","라라라","마마마"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println("");

		int[] score = {90, 80, 70, 50, 30};
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}

}
