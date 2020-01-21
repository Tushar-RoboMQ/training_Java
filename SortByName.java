package Exceptions;

import java.util.Comparator;

public class SortByName implements Comparator<Book>{
	
	@Override
	public int compare(Book c1, Book c2) {
		String name1 = c1.getName();
		String name2 = c2.getName();
		int r = name1.compareTo(name2);
		return r;
	}

}
