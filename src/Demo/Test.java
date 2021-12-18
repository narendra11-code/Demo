package Demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List <String> ls = Arrays.asList("Ram", "Lakhan", "Raj", "Taj", "Daj");
		Iterator<String> itr = ls.iterator();
		
		while(itr.hasNext()) {
			
			 System.out.println(itr.next());
		}
	}
}

