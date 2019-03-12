package ch19_io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

// Reader - 2바이트 단위로 입력
// 변환 방법 : new InputStreamReader(InputStream 객체)
// InputStream : 바이트 단위로 입력
// InputStreamReader : 문자 단위로 입력
public class ReaderExam {
	public static void main(String[] args) {
		int var = 0;
		Reader input = new InputStreamReader(System.in);
		System.out.println("입력하세요 : ");
		try {
			while(true) {
				var = input.read();	// 1개의 문자를 읽음
				if(var == 13) break;	// 엔터키를 읽으면 종료
				System.out.println((char)var + " ==> " + var);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
