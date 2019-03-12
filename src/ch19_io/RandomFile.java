package ch19_io;

import java.io.RandomAccessFile;

// 비순차적 파일(RandomAccessFile)

// String - 불변성(immutable)
// StringBuilder, StringBuffer - 가변성(mutable)
public class RandomFile {
	public static void main(String[] args) {
		StringBuilder output = new StringBuilder();
		String str = null;
		System.out.println("시작");
		
		try {
			// new RandomAccessFile(파일이름, 옵션)
			// 옵션 r - 읽기전용, w - 쓰기전용, rw - 읽기, 쓰기 가능
			// 읽기 + 쓰기 가능한 비순차접근 파일
			RandomAccessFile file = new RandomAccessFile("/Users/kyeongmin/Documents/test.txt", "rw");
			
			// getFilePointer() : 파일의 포인터(몇번째 글자인지) 
			// 파일포인터(파일에서 읽을 위치를 가리키는 포인터)
			
			file.seek(17);	// 파일 포인터를 이동시킴
			// write(문자열.getBytes()) : 문자열을 바이트배열로 변환한 후 파일에 저장
			file.write("추가한문자열".getBytes("utf-8"));
			file.seek(0);
			
			while(file.getFilePointer() < file.length()) {
				// 파일포인터 표시
				output.append(file.getFilePointer() + ":");
				str = file.readLine();	// 한 줄을 읽음
				// new String(바이트배열, 문자셋) : 인코딩 변환
				str = new String(str.getBytes("8859_1"), "utf-8");
				output.append(str + "\r\n");	// StringBuilder에 덧붙임
			}
			file.close();	// 파일 객체 닫음
			System.out.println(output);
			System.out.println("종료");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
