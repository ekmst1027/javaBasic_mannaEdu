package ch20_network;

import java.net.URLDecoder;
import java.net.URLEncoder;

// url에는 한글, 특수문자가 포함될 수 없음.
// url encoding(인코딩) : 한글, 특수문자를 url 형식으로 변환시킴
// url decoding(디코딩) : 인코딩된 문자열을 처음 내용으로 복원시킴
public class UrlEncodeExam {
	public static void main(String[] args) {
		try {
			// URLEncoder.encode(인코딩할 문자열, 인코딩 형식) ==> 암호화
			// utf-8(다국어처리), utf-8(한글인코딩)
			System.out.println(URLEncoder.encode("내 이름은 김삼순", "utf-8"));
			
			System.out.println(URLDecoder.decode("%EB%82%B4+%EC%9D%B4%EB%A6%84%EC%9D%80+%EA%B9%80%EC%82%BC%EC%88%9C\n" + 
					"", "utf-8"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
 