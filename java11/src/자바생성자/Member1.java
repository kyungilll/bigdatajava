package 자바생성자;

public class Member1 {
	String id;
	String pw;
	String grade;
	int point;
	
	
	
	public Member1(String id, String pw, String grade, int point) {
		this.id = id;
		this.pw = pw;
		this.grade = grade;
		this.point = point;
	}



	@Override
	public String toString() {
		return id + "의 비밀번호는 " + pw + "입니다. \n " + grade + "       " + point; 
	}
}
