package ch19_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamExam2 {
	public static void main(String[] args) {
		// 역직렬화(파일에 저장된 객체를 다시 메모리로 불러옴)
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("/Users/kyeongmin/Documents/object.data");
			ois = new ObjectInputStream(fis);	// 객체직렬화 처리 객체
			MemberDTO dto1 = (MemberDTO)ois.readObject();	// 객체 로딩
			MemberDTO dto2 = (MemberDTO)ois.readObject();
			MemberDTO dto3 = (MemberDTO)ois.readObject();
			System.out.println(dto1);
			System.out.println(dto2);
			System.out.println(dto2);
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
