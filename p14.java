import java.math.BigInteger;
import java.util.ArrayList;


public class p14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = 0;
		
		for (int i = 1; i < 1000000; i++){
			int c = 1;
			BigInteger n = BigInteger.valueOf(i);
			
			if (i == 113383){
				System.out.println("YO_");
			}
			
			while (!n.equals(BigInteger.ONE)){				
				if (n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
					n = n.divide(BigInteger.valueOf(2));
				}
				else {
					n = n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
				}
				
				c++;
			}
			
			if (c > max)
			{
				max = c;
				System.out.println(i + " " + c);
			}
		}
		
		System.out.println(max);
	}

}
