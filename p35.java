
public class p35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 0;
		boolean x[] = new boolean[1000001];
		boolean b[] = sieveToN(1000000);
		
		
		for (int i = 0; i < 1000001; i++) {
			x[i] = false;
		}
		for (int i = 2; i < 1000001; i++) {
			String s = i + "";
			if (!s.contains("0") && !x[i]) {
				int len = s.length();
				String t[] = new String[len];
				boolean m = true;
				for (int r = 0; r < len; r++) {
					t[r] = s.substring(r, len) + s.substring(0, r);
					int z = Integer.parseInt(t[r]);
					if (!b[z]) {
						m = false;
					}
				}
				
				if (m) {
					for (int r = 0; r < len; r++) {
						x[Integer.parseInt(t[r])] = true;

						System.out.println(t[r]);
					}
				}
			}
		}
		for (int i = 2; i < 1000001; i++) {
			if (x[i])
				n++;
		}
		
		System.out.println(n);
	}
	
	public static boolean[] sieveToN(int N) {
		boolean s[] = new boolean[N+1];
		s[0]=false;
		s[1]=false;
		for (int i = 2; i < N+1; i++)
			s[i]=true;
		
		for (int i = 2; i < N+1; i++) {
			if (s[i]) {
				int m=2;
				while(i*m < N+1) {
					s[i*m]=false;
					m++;
				}
			}
		}
		
//		for (int i = 0; i < N; i++) {
//			if (s[i])
//				System.out.print(i+", ");
//		}
		return s;
	}

}
