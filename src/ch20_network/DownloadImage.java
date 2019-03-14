package ch20_network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws Exception {
		String website = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
		System.out.println("이미지를 다운로드 합니다.");
		URL url = new URL(website);
		byte[] buffer = new byte[2048];	// 바이트배열(버퍼)
		// try~with : try 절에 선언한 리소스는 try절이 끝나면 자동 소멸
		try(InputStream in = url.openStream();
				OutputStream out = new FileOutputStream("/Users/kyeongmin/Documents/test.jpg")) {
			int length = 0;
			// read(버퍼) : 버퍼에서 읽음
			while((length = in.read(buffer)) != -1) {
				System.out.println(length + "바이트 읽음");
				// write(버퍼, 시작위치, 바이트수) : 파일에 기록
				out.write(buffer, 0, length);
			}
			System.out.println("다운로드가 완료되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
