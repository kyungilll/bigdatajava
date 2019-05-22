package 인터페이스2;

import 인터페이스.MemberDTO;
import 인터페이스.MemberInterface;

public class MemberDAO implements MemberInterface {

	@Override
	public void insert(MemberDTO dto) {
		System.out.println("insert");
	}

	@Override
	public void delete(String id) {
		System.out.println("delete");
	}

	@Override
	public void update(MemberDTO dto) {
		System.out.println("update");
	}

	@Override
	public MemberDTO select(String id) {
		MemberDTO name = new MemberDTO("A","A","A","A");
		return null;
	}

}
