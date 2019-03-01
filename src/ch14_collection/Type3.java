package ch14_collection;

// Type3<T> : 자료형이 미정인 상태
// 컴파일할 때는 미정이고 실행할 때 결정됨
// 하나의 클래스로 다양한 자료형을 처리(제네릭, 일반화)
public class Type3<T> {	// 자료형이 미정
	T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		Type3<String> t = new Type3<String>();	// 컴파일할 때 자료형을 미리 고정시킴
		t.setValue("100");
		System.out.println(t.getValue());
	}
}
