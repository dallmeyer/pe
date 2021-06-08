import java.util.Scanner;

public class p11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] grid = new int[20][20];
		
		for (int i = 0; i < 20; i++)
		{
			for (int j = 0; j < 20; j++)
			{
				grid[i][j] = in.nextInt();
			}
		}
		
		int max = 0;
		
		//up/down
		for (int i = 0; i < 16; i++)
		{
			for (int j = 0; j < 20; j++)
			{
				int temp = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
				max = Math.max(max, temp);
			}
		}
		
		//left/right
		for (int i = 0; i < 20; i++)
		{
			for (int j = 0; j < 16; j++)
			{
				int temp = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3]; 
				max = Math.max(max, temp);
			}
		}
		
		//diag1
		for (int i = 0; i < 16; i++)
		{
			for (int j = 0; j < 16; j++)
			{
				int temp = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
				max = Math.max(max, temp); 
			}
		}
		
		//diag2
		for (int i = 0; i < 16; i++)
		{
			for (int j = 0; j < 16; j++)
			{
				int temp = grid[i][j+3] * grid[i+1][j+2] * grid[i+2][j+1] * grid[i+3][j]; 
				max = Math.max(max, temp);
			}
		}
		
		System.out.println(max);
	}

}
