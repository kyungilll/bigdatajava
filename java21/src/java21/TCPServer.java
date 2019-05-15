package java21;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception { // throws Exception 업캐스팅 자동형변환

		ServerSocket server = new ServerSocket(9100); // (9100) 포트번호 지정
		System.out.println("TCP 서버소켓 시작됨");
		System.out.println("클라이언트에 연결을 기다리는 중...");
		while (true) {
			Socket socket = server.accept();
			System.out.println("클라이언트와 연결성공");
		}
		// 같은 포트로 2번 돌리면 에러 발생 : Address already in use /JVM_Bind
		// 이미 해당 포트를 사용하고 있음
		// 다시 돌리기 위해서는 콘솔창 X > 중지
	}

}
