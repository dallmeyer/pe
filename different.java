import java.math.BigInteger;
import java.util.Scanner;


public class different {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext())
		{
			BigInteger a = in.nextBigInteger();
			BigInteger b = in.nextBigInteger();
			
			
			System.out.println(a.subtract(b).abs());
		}
		
	}

}
