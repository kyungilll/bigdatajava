package 배열;

public class 배열연습2 {

	public static void main(String[] args) {
		int[] scores = {44,66,22,88};
		
for (int i = 0; i < scores.length; i++) {
	System.out.println(scores[i]);
}

System.out.println(scores.length);
		scores[0] = 55;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}
}
