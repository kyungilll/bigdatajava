package 일기장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일다루기2 {
	public static void main(String[] args) throws Exception {
		//파일에 저장
		//객체생성
		//메소드 사용(호출)
		
		// => 외부자원 연결시 에러처리
		
		String name = JOptionPane.showInputDialog("이름입력");
		String tel = JOptionPane.showInputDialog("연락처입력");
		String addr = JOptionPane.showInputDialog("주소입력");
		
		FileWriter w = new FileWriter(name + ".txt");
		w.write("안녕하세요.\n");
		w.write("반갑습니다.\n");
		
		w.write(name + "\n");
		w.write(tel + "\n");
		w.write(addr + "\n"); 
		
		
		w.close(); //끝낸 뒤에 값이 들어감
	}
}
