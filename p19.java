
public class p19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int day = (1 + 366) % 7;
		int count = 0;
		
		for (int y = 1901; y < 2001; y++) 
		{
			//jan
			for (int d = 1; d < 32; d++, day++){
				day %= 7;
				if (day == 0 && d == 1)
					count++;
			}
			//feb
			if (y % 4 == 0) {
				for (int d = 1; d < 30; d++, day++){
					day %= 7;
					if (day == 0 && d == 1)
						count++;
				}
			}
			else {
				for (int d = 1; d < 29; d++, day++){
					day %= 7;
					if (day == 0 && d == 1)
						count++;
				}
			}
			//mar
			for (int d = 1; d < 32; d++, day++){
				day %= 7;
				if (day == 0 && d == 1)
					count++;
			}
			for (int d = 1; d < 31; d++, day++){
				day %= 7;
				if (day == 0 && d == 1)
					count++;
			}
			for (int d = 1; d < 32; d++, day++){
				day %= 7;
				if (day == 0 && d == 1)
					count++;
			}
			for (int d = 1; d < 31; d++, day++){
				day %= 7;
				if (day == 0 && d == 1)
					count++;
			}
			for (int d = 1; d < 32; d++, day++){
				day %= 7;
				if (day == 0 && d == 1)
					count++;
			}
			for (int d = 1; d < 32; d++, day++){
				day %= 7;
				if (day == 0 && d == 1)
					count++;
			}
			for (int d = 1; d < 31; d++, day++){
				day %= 7;
				if (day == 0 && d == 1)
					count++;
			}
			for (int d = 1; d < 32; d++, day++){
				day %= 7;
				if (day == 0 && d == 1)
					count++;
			}
			for (int d = 1; d < 31; d++, day++){
				day %= 7;
				if (day == 0 && d == 1)
					count++;
			}
			for (int d = 1; d < 32; d++, day++){
				day %= 7;
				if (day == 0 && d == 1)
					count++;
			}
			
			
		}
		
		System.out.println(count);
	}

}
