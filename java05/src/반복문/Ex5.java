package 반복문;

public class Ex5 {

	public static void main(String[] args) {

		for (int i=1; i<=9; i++) {
			
			for (int j=1; j<=9; j++) {
				
				System.out.print(i + "*" + j +"=" + i*j);
				if (j==9) {
					System.out.println();
				}
			}
				
		}
	}

}
