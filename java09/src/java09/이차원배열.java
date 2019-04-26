package java09;

public class 이차원배열 {

	public static void main(String[] args) {
		//초기값을 지정하는 경우
		int[][] num = {
				{1,2},
				{4,5,6}
				}; //2행 3열
		//초기값을 지정하지 않는 경우
		int[][] seat = new int[3][10];
		
		System.out.println(num[0][1]);
		System.out.println(num[1][2]);
		
		System.out.println(num.length); // 2 출력됨 > 행의 갯수만 들어감
		//각 행마다 개수를 다르게 지정, 입력할 수 있음
		//열의 개수는 따로 구해줘야 함
		
		System.out.println(num[0].length); // 0행의 개수, 길이
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
	}

}
