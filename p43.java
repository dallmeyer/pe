import java.math.BigInteger;


public class p43 {

	public static int[] p = {2, 3, 5, 7, 11, 13, 17};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean[] b = new boolean[10];
		for (int i = 0; i < 10; i ++) {
			b[i] = false;
		}
		System.out.println(f("", b));
	}
	
	public static BigInteger f(String s, boolean b[]) {
		if (s.length() == 10) {
			for (int i = 0; i < 7; i++) {
				int t = Integer.parseInt(s.substring(i+1, i+4));
				if (t % p[i] != 0) {
					return BigInteger.ZERO;
				}
			}	
			
			return BigInteger.valueOf(Long.parseLong(s));
		}
		
		BigInteger n = BigInteger.ZERO;
		
		for (int i = 0; i < 10; i++) {
			boolean[] bb = b.clone();
			if (!bb[i]) {
				bb[i] = true;
				n = n.add(f(s+i, bb));
			}
		}
		
		return n;
	}

}
