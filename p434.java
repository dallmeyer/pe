import java.math.BigInteger;
import java.util.Arrays;


public class p434 {

	public static void main(String[] args) {
		BigInteger x = BigInteger.ZERO;
		
		for (int m = 2; m < 6; m++)
		{
			for (int n = 3; n < 6; n++)
			{
				boolean[][] b = new boolean[m][n];
				for (int mm = 0; mm < m; mm++)
				{
					for (int nn = 0; nn < n; nn++)
					{
						b[mm][nn] = false;
					}
				}
				
				boolean[][] b2 = new boolean[m][n];
				
				for (int i = 0; i < m; i++)
				     b2[i] = Arrays.copyOf(b[i], n);
				
				b2[0][0] = true;
				x = x.add(g(b, m, n, 0, 0));
				x = x.add(g(b2, m, n, 0, 0));
				//System.out.println(m + " x " + n + " = " + x);
				
				
				
			}
		}
	}
	
	private static BigInteger g(boolean [][] b, int m, int n, int mm, int nn)
	{
		BigInteger x = BigInteger.ZERO;
		
		if (nn == n-1)	//end of row
		{
			if (mm == m-1 )	//end of board
			{
				if (isRigid(b, m, n))
				{
					print(b,m,n);
					x = BigInteger.ONE;
				}
			}
			else 
			{
				boolean[][] b1 = new boolean[m][n];
				for (int i = 0; i < m; i++)
				     b1[i] = Arrays.copyOf(b[i], n);
				
				boolean[][] b2 = new boolean[m][n];
				for (int i = 0; i < m; i++)
				     b2[i] = Arrays.copyOf(b[i], n);
				
				b1[mm+1][0] = true;
				x = x.add(g(b1, m, n, mm+1, 0));
				x = x.add(g(b2, m, n, mm+1, 0));
			}			
		}
		else
		{
			boolean[][] b1 = new boolean[m][n];
			for (int i = 0; i < m; i++)
			     b1[i] = Arrays.copyOf(b[i], n);
			
			boolean[][] b2 = new boolean[m][n];
			for (int i = 0; i < m; i++)
			     b2[i] = Arrays.copyOf(b[i], n);
			
			b1[mm][nn+1] = true;
			x = x.add(g(b1, m, n, mm, nn+1));
			x = x.add(g(b2, m, n, mm, nn+1));
		}

		return x;
	}	
	
	private static void print (boolean[][] b, int m, int n){
		for (int mm = 0; mm < m; mm++)
		{
			for (int nn = 0; nn < n; nn++)
			{
				if (b[mm][nn])
				{
					System.out.print("_");
				}
				else
				{
					System.out.print("X");
				}
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
	
	private static boolean isClosedCorner(boolean[][]b, int i, int j, int r)
	{
		switch (r)
		{
		case 0 :
			return (!b[i][j-1] && !b[i-1][j-1] && !b[i-1][j]);
		case 1 :
			return (!b[i-1][j] && !b[i-1][j+1] && !b[i][j+1]);
		case 2 :
			return (!b[i][j+1] && !b[i+1][j+1] && !b[i+1][j]);
		case 3 : 
			return (!b[i+1][j] && !b[i+1][j-1] && !b[i][j-1]);
		}
		
		return false;
	}
	
	private static boolean hasOpenCorner(boolean[][] b, int m, int n)
	{
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (b[i][j])
					continue;
				
				if (isOpenCorner(b, m, n, i, j))
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	private static boolean isOpenCorner(boolean[][] b, int m, int n, int i, int j)
	{
		int q = 0;
		
		if (i == 0 || b[i-1][j])
			q++;
		
		if (j == 0 || b[i][j-1])
			q++;
		
		if (i == m-1 || b[i+1][j])
			q++;
		
		if (j == n-1 || b[i][j+1])
			q++;
		
		if ((i == 0 || i == m-1) && (j == 0 || j == n-1))
			return q == 4;
		
		return q > 2;
	}
	
	private static boolean isRigid(boolean[][] b, int m, int n)
	{
		if (n == 1)
		{
			return isClosedColumn(b, m);
		}
				
		if (m == 1)
		{
			return isClosedRow(b, n);
		}
		
		if (hasOpenRow(b,m,n) || hasOpenCol(b,m,n))
		{
			return false;
		}
		
		if (hasOpenCorner(b,m,n))
		{
			return false;
		}
		
		return true;
	}
	
	private static boolean isClosedRow(boolean[][] b, int n)
	{
		for (int i = 0; i < n; i++)
		{
			if (b[0][i])
			{
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean isClosedColumn(boolean[][] b, int m)
	{
		for ( int i = 0; i < m ; i++)
		{
			if (b[i][0])
			{
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean hasOpenRow(boolean[][] b, int m, int n)
	{
		for (int i = 0; i < m; i++)
		{
			if (isOpenRow(b, i, n))
			{
				return true;
			}
		}
		return false;
	}
	
	private static boolean hasOpenCol(boolean[][] b, int m, int n)
	{
		for (int j = 0; j < n; j++)
		{
			if (isOpenCol(b, m, j))
			{
				return true;
			}
		}
		
		return false;
	}
	
	private static boolean isOpenRow(boolean[][] b, int i, int n)
	{
		for (int j = 0; j < n; j++)
		{
			if (!b[i][j])
				return false;
		}
		
		return true;
	}
	
	private static boolean isOpenCol(boolean[][] b, int m, int j)
	{
		for (int i = 0; i < m; i++)
		{
			if (!b[i][j])
			{
				return false;
			}
		}
		
		return true;
	}
}