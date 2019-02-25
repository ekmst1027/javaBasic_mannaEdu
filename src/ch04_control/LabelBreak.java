package ch04_control;

public class LabelBreak {
	public static void main(String[] args) {
		// label(∑π¿Ã∫Ì)
		exit_for:
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j == 3)
					break exit_for;
				System.out.println(i + ", " + j);
			}
		}
	}
}
