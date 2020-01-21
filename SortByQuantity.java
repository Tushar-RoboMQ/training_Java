package Exceptions;

import java.util.Comparator;

public class SortByQuantity implements Comparator<Book>{

	@Override
	public int compare(Book p1, Book p2) {
		int name1 = p1.getQuantity();
		int name2 = p2.getQuantity();
		int r=name1-name2;
		return r;
	}
}