package 일기장;

import java.io.FileWriter;
import java.io.IOException;

public class 파일다루기 {
	public static void main(String[] args) throws Exception {
		//파일에 저장
		//객체생성
		FileWriter w = new FileWriter("start.txt");
		//메소드 사용(호출)
		
		// => 외부자원 연결시 에러처리
		
		
		w.write("안녕하세요.\n");
		w.write("반갑습니다.\n");
		
		
		w.close(); //끝낸 뒤에 값이 들어감
	}
}
