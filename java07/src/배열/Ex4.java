package 배열;

public class Ex4 {

	public static void main(String[] args) {

		int[] num = {11,22,33,44};

		for (int i = 0; i < num.length; i++) {
			if (num[i]==33) {
				System.out.println(i+1 + "번째에 위치");
			}
		}
	}

}
