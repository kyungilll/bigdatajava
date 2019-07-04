package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import product.DBConnectionMgr;

public class ProductDAO {

	private static ProductDAO instance;
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	DBConnectionMgr mgr;
	
	public ProductDAO() {
		mgr = DBConnectionMgr.getInstance();
	}
	public ArrayList<ProductDTO> selectAll() throws Exception { // 정보 전체 검색

		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		ProductDTO dto = null;

		con = mgr.getConnection();

		String sql = "select * from product";
		ps = con.prepareStatement(sql);

		rs = ps.executeQuery();

		while (rs.next()) {
			dto = new ProductDTO();
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String price = rs.getString(4);


			dto.setId(id);
			dto.setTitle(title);
			dto.setContent(content);
			dto.setPrice(price);

			list.add(dto);

		} // while end

		return list;

	} // select end
	
	public static ProductDAO getInstance() {
		if (instance == null) {
			instance = new ProductDAO();
		}
		return instance;

	}
	public ProductDTO select(String id) { // id로 상품 검색

		ProductDTO dto2 = null;
		try {
			con = mgr.getConnection();
			// 3단계 sql문 결정
			String sql = "select * from product where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);

			// 4단계 sql문 실행 요청
			rs = ps.executeQuery();

			while (rs.next()) {
				dto2 = new ProductDTO();
				id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String price = rs.getString(4);


				dto2.setId(id);
				dto2.setTitle(title);
				dto2.setContent(content);
				dto2.setPrice(price);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dto2;
	}
	
	public void insert(ProductDTO dto) throws Exception { // 상품등록

		con = mgr.getConnection();

		String sql = "insert into product values(?,?,?,?)";

		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getPrice());

		ps.executeUpdate();

	}
	public void delete(String id) throws Exception { // 상품등록

		con = mgr.getConnection();

		String sql = "delete from product where id=?";

		ps = con.prepareStatement(sql);
		ps.setString(1, id);

		ps.executeUpdate();

	}
	
	public void update(ProductDTO dto) throws Exception { // 상품등록

		con = mgr.getConnection();

		String sql = "update product set title=?, content=?, price=? where id=?";

		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getTitle());
		ps.setString(2, dto.getContent());
		ps.setString(3, dto.getPrice());
		ps.setString(4, dto.getId());

		ps.executeUpdate();

	}
	
}
