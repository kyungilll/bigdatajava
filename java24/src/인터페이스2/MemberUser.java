package 인터페이스2;

import 인터페이스.MemberDTO;

public class MemberUser {

	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO("kim","kim","kim","kim");
		MemberDAO dao = new MemberDAO();

		dao.insert(dto);
		dao.update(dto);
		dao.delete("kim");
		MemberDTO dto2 = dao.select("kim");
	}
}
