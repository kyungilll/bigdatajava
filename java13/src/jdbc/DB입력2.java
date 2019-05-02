package jdbc;

import java.util.Scanner;

public class DB입력2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("----회원가입정보입력----");
	
	System.out.print("ID : ");
	String id = sc.next();
	System.out.print("PW : ");
	String pw = sc.next();
	System.out.print("NAME : ");
	String name = sc.next();
	System.out.print("TEL : ");
	String tel = sc.next();
	System.out.print("찾을 ID : ");
	String fid = sc.next();
	System.out.print("변경할 TEL : ");
	String ctel = sc.next();
	
	Db처리 db = new Db처리();
	
	try {
		db.update(fid, ctel);
	} catch (Exception e) {
		e.printStackTrace(); //에러정보출력
	} 
}
}
