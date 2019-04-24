package 배열;

public class Ex6 {
public static void main(String[] args) {
	int[] num = {66,77,88,99};
	int x = num[0];
	
	num[0] = num[3];
	num[3] = x;
	
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
}
}
