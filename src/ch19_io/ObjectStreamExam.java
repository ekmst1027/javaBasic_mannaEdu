package ch19_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamExam {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		MemberDTO m1 = new MemberDTO("kim", 30, "871231-1234567", "1234");
		MemberDTO m2 = new MemberDTO("park", 28, "891231-1234567", "2222");
		MemberDTO m3 = new MemberDTO("hong", 25, "921231-1234567", "3333");
		try {
			fos = new FileOutputStream("/Users/kyeongmin/Documents/object.data");
			oos = new ObjectOutputStream(fos);	// 객체직렬화 처리 객체
			oos.writeObject(m1);	// 객체를 파일로 저장
			oos.writeObject(m2);
			oos.writeObject(m3);
			System.out.println("객체를 저장했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
