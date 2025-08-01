package com.cdac.acts.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cdac.acts.book.Book;
import com.cdac.acts.enums.BookTypeEnum;
import com.cdac.acts.enums.PrinterTypeEnum;
import com.cdac.acts.printer.Printer;

public interface DataEntry {
	public static ArrayList<Book> bookList(){
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("My Life", BookTypeEnum.valueOf("FIC"), 125.5, LocalDate.parse("2025-12-12"), "Bhumur", 15));
		books.add(new Book("Naruto", BookTypeEnum.valueOf("FIC"), 125.5, LocalDate.parse("2025-12-12"), "Bhumur", 15));
		books.add(new Book("Story of my Lisfe", BookTypeEnum.valueOf("FIC"), 125.5, LocalDate.parse("2025-12-12"), "Bhumur", 15));
		books.add(new Book("Hello School", BookTypeEnum.valueOf("FIC"), 125.5, LocalDate.parse("2025-12-12"), "Bhumur", 15));
		books.add(new Book("Chalo Age Bado", BookTypeEnum.valueOf("FIC"), 125.5, LocalDate.parse("2025-12-12"), "Bhumur", 15));
		books.add(new Book("Runner", BookTypeEnum.valueOf("FIC"), 125.5, LocalDate.parse("2025-12-12"), "Bhumur", 15));
		books.add(new Book("CDAC", BookTypeEnum.valueOf("FIC"), 125.5, LocalDate.parse("2025-12-12"), "Bhumur", 15));
		
		return books;
	}
	
	public static Map<Integer,Printer> printerMap(){
		Map<Integer,Printer> printers = new HashMap<>();
		printers.put(1122,new Printer(1122, "1ad18", 1258.2, PrinterTypeEnum.valueOf("LASER"), LocalDate.parse("2024-05-02")));
		printers.put(1785,new Printer(1785, "88dwa", 6258.2, PrinterTypeEnum.valueOf("DOTMATRIX"), LocalDate.parse("2024-05-02")));
		printers.put(2569,new Printer(2569, "7wda5", 2258.2, PrinterTypeEnum.valueOf("LASER"), LocalDate.parse("2024-05-02")));
		printers.put(1616,new Printer(1616, "15dw4", 9258.2, PrinterTypeEnum.valueOf("INKJET"), LocalDate.parse("2024-05-02")));
		printers.put(1968,new Printer(1968, "46dw4", 11258.2, PrinterTypeEnum.valueOf("DOTMATRIX"), LocalDate.parse("2024-05-02")));
		return printers;
	}
}
