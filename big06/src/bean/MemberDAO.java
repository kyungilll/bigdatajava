package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	// dao의 단계를 효율적으로 변경
	MemberDTO dto = new MemberDTO();

	public void insert(MemberDTO dto) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 완료");

		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());

		ps.executeUpdate();
		System.out.println("DB입력 완료");
	}
}
