package ch10_static;

// static 변수 : 메모리에 1개만 생성됨
public class StaticVar2 {
	static int total;
	String model;
	
	public StaticVar2(String model) {
		this.model = model;
		total++;
	}
}
