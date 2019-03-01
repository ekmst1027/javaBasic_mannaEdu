package ch14_collection;

public class Type2 {
	Object value;
	
	// String s = value;
	// int a = value;
	public Object getValue() {
		return value;
	}
	
	// Object value = "kim";
	// Object value = 100;
	public void setValue(Object value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		System.out.println(t.getValue());
		t.setValue(100);
		System.out.println(t.getValue());
	}
}
