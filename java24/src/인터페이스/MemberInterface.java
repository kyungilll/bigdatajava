package 인터페이스;

public interface MemberInterface {
	// 문법적으로 강제성있게 기능을 추상메소드로 정의 (구체적이지 않은, 불완전한)
	
	public abstract void insert(MemberDTO dto);

	void delete(String id);

	void update(MemberDTO dto);

	MemberDTO select(String id);
	// 위 메소드가 반드시 구현되어야 한다.
	// 이름, 반환값 등만 반드시 입력되어있어야 함

	// 정확하게 구현하지 않음
	// 기능만 정의하다보니 일반변수,일반메소드 사용불가 
		// > 상수는 사용가능
	// 기능을 메소드로 정의
	// 인터페이스는 객체를 생성하여 쓸 수 없다
	// interface name = new interface(); > 식으로 쓸 수 없음

}
