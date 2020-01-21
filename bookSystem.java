package Exceptions;
import java.util.*;

public class bookSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> cus = new ArrayList<Book>();   //Here we have inistiated 
		
		cus.add(new Book(1, "Tushar", "mark manson", "The penguin", 3));
		cus.add(new Book(2, "Ram", "Robin Sharma", "The penguin", 2));
		cus.add(new Book(3, "Shyam", "Orson", "The Publishers", 7));
		
		System.out.println(cus);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1:sort by Id \n 2: Sort By name \n 3: Sort By author \n 4: Sort By Publisher \n 5. Sort By Quantity");
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			System.out.println("Sorted By Book name \n");
			SortByName n = new SortByName();
			cus.sort(n);
			System.out.println(cus);
		}
		
		if(ch==2)
		{
			System.out.println("Sorted By Id \n");
			SortById m=new SortById();
			cus.sort(m);
			System.out.println(cus);
		}
		
		if(ch==3)
		{
			System.out.println("Sorted By Author name \n");
			SortByAuthor o = new SortByAuthor();
			cus.sort(o);
			System.out.println(cus);
		}
		if(ch==4)
		{
			System.out.println("Sorted By Publisher name \n");
			SortByPublisher p = new SortByPublisher();
			cus.sort(p);
			System.out.println(cus);
		}		
		
		if(ch==5)
		{
			System.out.println("Sorted By Quantity \n");
			SortByQuantity q = new SortByQuantity();
			cus.sort(q);
			System.out.println(cus);
		}

	}

}
