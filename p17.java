
public class p17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int l = 0;
		for (int i = 1; i < 1000; i++) {
			System.out.println(s(i));
			l += s(i).length();
		}
		l += 11;
		
		System.out.println(l);
	}
	
	private static String s(int i) {
		String x = "";
		if (i > 99) {
			x += n(i/100) + "hundred";
			i = i%100;
			
			if (i > 0)
				x += "and";
		}
		
		if (i > 0) {
			x += n(i); 
		}
		
		return x;
	}
	
	private static String n(int i) {
		switch (i)
		{
		case 0: return "";
		case 1 : return "one";
		case 2 : return "two";
		case 3 : return "three";
		case 4 : return "four";
		case 5 : return "five";
		case 6 : return "six";
		case 7 : return "seven";
		case 8 : return "eight";
		case 9 : return "nine";
		case 10 : return "ten";
		case 11: return "eleven";
		case 12: return "twelve";
		case 13: return "thirteen";
		case 14 : return "fourteen";
		case 15: return "fifteen";
		case 16: return "sixteen";
		case 17: return "seventeen";
		case 18: return "eighteen";
		case 19: return "nineteen";
		default:
			return d(i/10) + n(i%10);
		}
	}
	
	private static String d(int i) {
		switch(i){
		case 2: return "twenty";
		case 3: return "thirty";
		case 4: return "forty";
		case 5: return "fifty";
		case 6: return "sixty";
		case 7: return "seventy";
		case 8: return "eighty";
		case 9: return "ninety";
		}
		return "";
	}
	

}
