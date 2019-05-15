package java21;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//네트워크 통신은 소켓이 있어야함.
		DatagramSocket socket = new DatagramSocket(); 
			//보내는 입장에서는 포트를 지정할 필요없음
		
		//UDP는 소켓 1개
		//소켓을 통해 패킷을 전송함.
		InetAddress ip = InetAddress.getByName("192.168.0.115");
		String str = "I am a JAVA programmer";
		byte[] data = str.getBytes(); // 위 스트링을 바이트 배열로 만들어 줌
		DatagramPacket packet = new DatagramPacket(data, data.length,ip,7000); 
			// ()가져갈 데이터, 데이터 길이, ip, port
		
		socket.send(packet);
		socket.close();
	}

}
