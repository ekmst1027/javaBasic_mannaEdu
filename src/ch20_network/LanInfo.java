package ch20_network;

import java.net.NetworkInterface;
import java.util.Enumeration;

public class LanInfo {
	public static void main(String[] args) {
		try {
			Enumeration<NetworkInterface> enu = 
					NetworkInterface.getNetworkInterfaces();
			// 다음 요소가 있으면
			while(enu.hasMoreElements()) {
				// 다음 요소를 조회
				NetworkInterface net = enu.nextElement();
				System.out.println(net);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
