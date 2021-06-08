
public class p12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1;
		int x = 0;
		
		while (true)
		{
			x += i;
			
			int n = d(x);
			
			//System.out.println(x + " - " + n);
			
			if (n > 500)
			{
				break;
			}
			
			i++;
		}
		
		System.out.println(x);
	}
	
	private static int d(int x)
	{
		int s = x/2;
		int n = 0;		
		
		for (int i = 1; i <= s; i++)
		{
			if (x % i == 0)
			{
				n++;
			}
		}
		
		return n+1;
	}

}
