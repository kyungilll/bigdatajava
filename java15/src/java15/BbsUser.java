package java15;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BbsUser {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		Scanner sc = new Scanner(System.in);
		
		String inputId = JOptionPane.showInputDialog("찾을 ID를 입력하시오");
		
		BbsDAO dao = new BbsDAO();
		BbsDTO dto = dao.select(inputId);
		System.out.println("검색된 ID는 : " + dto.getId());
		System.out.println("검색된 Title는 : " + dto.getTitle());
		System.out.println("검색된 Content는 : " + dto.getContent());
		System.out.println("검색된 Etc는 : " + dto.getEtc());
		
		f.setSize(500, 500);
		f.setVisible(true);
		
	}
}
