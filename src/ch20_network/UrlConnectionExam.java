package ch20_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// URL : URL의 정보를 분석
// URLConnection : URL에 접속
// 접속 성공 => 로컬컴퓨터와 원격컴퓨터 사이에 스트림을 생성해야 함
public class UrlConnectionExam {
	public static void main(String[] args) {
		URL url = null;
		HttpURLConnection conn = null;
		BufferedReader br = null;
		try {
			url = new URL("http://google.com");
			conn = (HttpURLConnection) url.openConnection();
			System.out.println("연결정보 : " + conn);
			if(conn != null) {
				// 10초동안 접속을 시도
				conn.setConnectTimeout(10000);
				StringBuilder sb = new StringBuilder();
				// HttpStatus 코드(http 상태 코드)
				// 200 정상, 404 잘못된 주소, 500 서버 내부 오류
				// 접속이 성공하면
				if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
					while(true) {
						String line = br.readLine();	// 한 라인을 읽음
						if(line == null) break;	// 더 이상 내용이 없으면 종료
						sb.append(line+"\r\n");	// 줄바꿈 문자를 포함해야 함
					}
//					br.close();	// 버퍼 닫기
				}
				conn.disconnect();	// 원격컴퓨터와 접속 종료
				System.out.println(sb);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
