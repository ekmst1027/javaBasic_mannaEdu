package ch20_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

// 도메인과 IP주소
public class InetAddressExam {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("google.com");
			System.out.println(address);
			System.out.println(address.getHostName());	// 도메인 주소
			System.out.println(address.getHostAddress());	// IP 주소
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
