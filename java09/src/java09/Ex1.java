package java09;

public class Ex1 {

	public static void main(String[] args) {
		int[][] member = {
				{44,55,66},
				{77,88,99,100}
				
		};
		
		for (int i = 0; i < member.length; i++) {
			int sum = 0;
			for (int j = 0; j < member[i].length; j++) {
				sum = sum + member[i][j];
			}
			System.out.println((i+1) + "반의 평균은" + sum/member[i].length + "점 입니다.");
		}
		
		for (int i = 0; i < member.length; i++) {
			System.out.print((i+1) + "반 > ");
			for (int j = 0; j < member[i].length; j++) {
				System.out.print(member[i][j] + " ");
			}
			System.out.println();
		}
	}

}
