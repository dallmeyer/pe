import java.math.BigInteger;
import java.util.ArrayList;


public class p15 {

	/**
	 * @param args
	 */
	private static ArrayList<String> a;
	
	public static void main(String[] args) {
		System.out.println(x(0, 0).toString());
	}
	
	private static BigInteger x(int r, int c){
		BigInteger m = BigInteger.ZERO;
		

		if (r == 20 && c == 20)
		{
 			m = m.add(BigInteger.ONE);
		}
		else
		{
			if (r < 20) {
				m = m.add(x(r+1, c));
			}
			
			if (c < 20) {
				m = m.add(x(r, c+1));
			}
		}
		return m;
	}

}
