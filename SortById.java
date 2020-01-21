package Exceptions;

import java.util.Comparator;

public class SortById implements Comparator<Book>{

	@Override
	public int compare(Book p1, Book p2) {
		int name1 = p1.getMemberId();
		int name2 = p2.getMemberId();
		int r=name1-name2;
		return r;
	}
}