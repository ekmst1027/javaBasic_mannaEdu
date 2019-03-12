package ch19_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 버퍼를 이용한 입력(속도 개선)
public class BufferedReaderExam {
	public static void main(String[] args) {
		// new BufferedReader(InputStreamReader객체(InputStream객체))
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("입력하세요 : ");
		String str = null;
		try {
			str = reader.readLine();	// 한 라인을 읽음
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
