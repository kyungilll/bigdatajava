package 인터페이스;

public class MemberUser {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("kim", "kim", "kim", "kim");
		// 값을 넣어야지만 주소값이 생김
		dao.insert(dto);
		dao.update(dto);
		dao.delete("kim");
		MemberDTO dto2 = dao.select("kim");
	}
}
