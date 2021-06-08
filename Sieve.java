
public class Sieve {
	public static void main(String[] args) {
		boolean s[] = sieveToN(1000000);
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


