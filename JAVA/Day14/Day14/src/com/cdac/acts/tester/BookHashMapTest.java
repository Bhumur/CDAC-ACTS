package com.cdac.acts.tester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cdac.acts.book.Book;
import com.cdac.acts.enums.BookTypeEnum;
import com.cdac.acts.exception.BookNotFound;
import com.cdac.acts.exception.DuplicateBookException;
import com.cdac.acts.util.DataEntry;

public class BookHashMapTest {

	public static void main(String[] args) throws BookNotFound {
		//Map<String, Book> hashmap = new HashMap<>();
		Map<String, Book> hashmap = DataEntry.dataHashMap();
		int op;
		try(Scanner sc = new Scanner(System.in)){
			do {
				System.out.println("1. Add book.\n"
						+ "2. Display All books.\n"
						+ "3. Find by book title.\n"
						+ "4. Allot book to student (quantity -1).\n"
						+ "5. Take book return (quantity +1) Find by book title\n"
						+ "6. Remove book\n"
						+ "0. EXIT\n"
						+ "\nEnter Your Choice : ");
				op=sc.nextInt();
				switch(op) {
					case 1: {
						String title = "";
						sc.nextLine();
						try {
							System.out.print("Enter Title of Book Want to Add : ");
							title = sc.nextLine();
							Book b = hashmap.get(title);
							if(b!=null) {
								throw new DuplicateBookException("Book Already Exixts");
							}
						}catch (Exception e) {
							e.printStackTrace();
							break;
						}
						System.out.print("Enter BookType : ");
						String strtype = sc.next();
						BookTypeEnum type = BookTypeEnum.valueOf(strtype);
						System.out.print("Enter Price of Book : ");
						Double price = sc.nextDouble();
						System.out.print("Enter Publish Date of Book in dd/mm/yyyy formate : ");
						String strpublishdate = sc.next();
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						LocalDate publishDate = LocalDate.parse(strpublishdate, formatter);
						System.out.print("Enter Author Name of Book : ");
						sc.nextLine();
						String aname = sc.nextLine();
						System.out.print("Enter Quantity of Book : ");
						Integer qty = sc.nextInt();
						hashmap.put(title, new Book(title,type,price,publishDate,aname,qty));
						break;
					}
					case 2: {
						sc.nextLine();
						Set<Map.Entry<String, Book>> entry = hashmap.entrySet(); 
						for(Map.Entry<String, Book> e : entry) {
							System.out.println("Title : " + e.getKey() + " === Book : " + e.getValue());
						}
						break;
					}
					case 3: {
						sc.nextLine();
						System.out.println("Enter Title of Book : ");
						String title = sc.nextLine();
						Book book = null;
						try {
							book = findBook(hashmap, title);
						}catch (BookNotFound e) {
							e.printStackTrace();
							break;
						}
						System.out.println(book);
						break;
					}
					case 4: {
						sc.nextLine();
						System.out.println("Enter Title of Book : ");
						String title = sc.nextLine();
						Book book = null;
						try {
							book = findBook(hashmap, title);
						}catch (BookNotFound e) {
							e.printStackTrace();
							break;
						}
						if(book.getQty()>0) {
							book.setQty(book.getQty()-1);
							System.out.println("BOOK ALLOTED SUCCESSFULLY");
						}
						else {
							System.out.println("BOOK OUT OFF STOCK");
						}
						break;
					}
					case 5: {
						sc.nextLine();
						System.out.println("Enter Title of Book : ");
						String title = sc.nextLine();
						Book book = null;
						try {
							book = findBook(hashmap, title);
						}catch (BookNotFound e) {
							e.printStackTrace();
							break;
						}
						book.setQty(book.getQty()+1);
						System.out.println("BOOK RETURENED SUCCESSFULLY");
						break;
					}
					case 6: {
						sc.nextLine();
						System.out.println("Enter Title of Book : ");
						String title = sc.nextLine();
						Book book = null;
						try {
							book = findBook(hashmap, title);
						}catch (BookNotFound e) {
							e.printStackTrace();
						}
						hashmap.remove(book.getTitle());
						System.out.println("BOOK SUCCESSFULLY REMOVED");
						break;
					}
					case 0: break;
					default: System.out.println("INVALID INPUT");
				}
			}while(op!=0);
		}
	}

	private static Book findBook(Map<String, Book> hashmap, String title) throws BookNotFound {
		String s = "";
		Set<Map.Entry<String, Book>> entry = hashmap.entrySet(); 
		for(Map.Entry<String, Book> e : entry) {
			if(title.equals(e.getKey())) {
				s = e.getKey();
				break;
			}
		}
		if(s=="")
		{
			throw new BookNotFound("Book Not Found");
		}
		return hashmap.get(s);
	}
}
