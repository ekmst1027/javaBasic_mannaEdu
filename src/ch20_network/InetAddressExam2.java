package ch20_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam2 {
	public static void main(String[] args) {
		try {
			// 도메인의 IP가 여러개일 경우
			InetAddress[] address = InetAddress.getAllByName("daum.net");
			for(int i = 0; i < address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
