import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class p22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = null;
		try {
			in = new Scanner(new File("yo.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int n = 0;
		ArrayList<String> s = new ArrayList<String>();
		while (in.hasNext()) {
			s.add(in.next());
		}
		
		Collections.sort(s);
		
		for (int i = 0; i < s.size(); i++) {
			String x = s.get(i);
			for (int c = 0; c < x.length(); c++)
			{
				n += ((i+1) * (a.indexOf(x.substring(c, c+1))+1));
			}
		}
		
		System.out.println(n);
	}

}
