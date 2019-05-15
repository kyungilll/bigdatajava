package java21;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient2 {
	public static void main(String[] args) throws Exception {
		Socket name = new Socket("localhost", 9100); //데이터연결용 소켓
		System.out.println("Client2 : 서버와 연결성공");
	}
}
