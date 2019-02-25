package ch03_operator;

public class Assign {
	public static void main(String[] args) {
		int a = 3, b = 5;
		a += 3;	// a = a + 3;
		System.out.println(a);
		b /= 5; // b = b / 5;
		System.out.println(b);
		a = 12;
		// 00001100 >> 2 우측시프트 => 00000011 (3)
		a >>= 2; // a = a >> 2;
		System.out.println(a);
	}
}
