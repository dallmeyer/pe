import java.util.Scanner;


public class p18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] x = new int[100][100];
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j <= i; j++) {
				x[i][j] = in.nextInt();
			}
		}
		
		System.out.println(f(x, 0, 0));
	}
	
	private static int f(int[][] x, int r, int c) {
		int total = 0;
		
		if (r < 99) {
			total = f(x, r+1, c);
			if (c <= r)
			{
				total = Math.max(total, f(x, r+1, c+1));
			}
			
		}
		
		total += x[r][c];
		return total;
	}

}
