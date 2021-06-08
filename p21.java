
public class p21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] x = new int[10000];
		
		for (int i = 1; i < 10000; i++)	
		{
			x[i] = d(i);
		}
		
		int sum = 0;
		
		for (int i = 2; i < 10000; i++)
		{
			for (int j = i + 1; j < 10000; j++)
			{
				if (i == j)
				{
					continue;
				}
				
				if (x[i] == j && x[j] == i)
				{
					sum += i + j;
				}
			}
		}
		
		System.out.println(sum);
	}

	private static int d(int x)
	{
		int s = x/2;
		int n = 0;		
		
		for (int i = 1; i <= s; i++)
		{
			if (x % i == 0)
			{
				n += i;
			}
		}
		
		return n;
	}
}
