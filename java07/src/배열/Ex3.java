package 배열;

public class Ex3 {

	public static void main(String[] args) {

		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		for (int i : num) {
			System.out.print(i);
			if (i<5) {
			System.out.print(" ");
			} else {
				break;
			}
		}
	}

}
