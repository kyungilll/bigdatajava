package java21;

import java.awt.BorderLayout;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MessengerA extends JFrame {

	JTextArea list;
	JTextField input;
	DatagramSocket socket;

	public MessengerA() throws Exception {
		socket = new DatagramSocket(5000);
		list = new JTextArea(6, 20);
		list.setFont(new Font("Monospaced", Font.BOLD, 29));
		list.setBackground(Color.LIGHT_GRAY);
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 텍스트 필드에서 입력 후 엔터를 쳤을 때
				String str = input.getText();
//				System.out.println("내가 입력한 값 : " + data);
				list.append("정경일 : " + str + "\n"); // settext와 다르게 누적됨
				input.setText("");

				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					// 보내는 입장에서는 포트를 지정할 필요없음

					// 소켓을 통해 패킷을 전송함.
					InetAddress ip = InetAddress.getByName("192.168.0.123");

					byte[] data = str.getBytes(); // 위 스트링을 바이트 배열로 만들어 줌
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 6000);
					// ()가져갈 데이터, 데이터 길이, ip, port

					socket.send(packet);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		input.setFont(new Font("Sitka Banner", Font.BOLD, 23));
		input.setBackground(Color.CYAN);
		setTitle("메신저A 채팅화면");
		getContentPane().add(list, BorderLayout.CENTER);
		getContentPane().add(input, BorderLayout.SOUTH);
		pack(); // 자동으로 정돈해 줌

		list.setEditable(false);
		// 채팅창은 변경하지 못하게끔

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// X 누르면 자동으로 프로그램 닫힘
		setVisible(true);
		// 콘솔 중지시킨 후 실행
	}

	public void process() throws Exception {
		// 패킷 받는코드(무한루프)
		while (true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			list.append("민병호 : " + new String(data) + "\n");
		}

	}

	public static void main(String[] args) throws Exception {
		MessengerA name = new MessengerA();
		name.process(); // 패킷 보내기 전 받는 코드가 먼저 돌아가야 함

	}

}
