package ch19_io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("./test.txt");
			System.out.println("입력하세요 : ");
			while(true) {
				int ch = System.in.read();	// 1바이트 읽음
				if(ch==13) break;	// 엔터키이면 종료
				// 프로그램 ===> 파일
				os.write(ch);	// 파일에 기록
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
