package 인터페이스2;

import java.lang.reflect.Member;

import 인터페이스.MemberDTO;

public interface MemberInterface {

	void insert(MemberDTO dto);
	
	void delete(String id);
	
	void update(MemberDTO dto);
	
	MemberDTO select(String id);
	
}
