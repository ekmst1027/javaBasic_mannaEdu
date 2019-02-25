package ch05_array;

public class Array2 {
	public static void main(String[] args) {
		int[][] num = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90} };
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}
