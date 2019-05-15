package java21;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSToIp {
	public static void main(String[] args) {
		String dns = "mgr.kgitbank.com";
		String dns1 = "www.naver.com";
		// 없는 dns 일 경우 오류발생

		InetAddress address;
		try {
			address = InetAddress.getByName(dns);

			System.out.println(address);
			// www.naver.com/104.93.0.236
			// mgr.kgitbank.com/210.116.103.33

			System.out.println("ip 주소 : " + address.getHostAddress());
			// ip 주소 : 210.89.164.90
		} catch (UnknownHostException e) {
			System.out.println("도메인 네임이 존재하지 않습니다.");
			System.out.println("올바른 도메인 네임을 입력하세요.");
		}

	}
}
