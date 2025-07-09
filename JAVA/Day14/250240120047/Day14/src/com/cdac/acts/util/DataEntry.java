package com.cdac.acts.util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.cdac.acts.book.Book;
import com.cdac.acts.enums.BookTypeEnum;
import com.cdac.acts.school.Student;
import com.cdac.acts.school.StudentKey;

public class DataEntry {
	public static HashMap<String, Book> dataHashMap(){
		HashMap<String, Book> hashmap = new HashMap<>();
		hashmap.put("Tom and Jerry", new Book("Tom and Jerry",BookTypeEnum.valueOf("HOR"),125.5,LocalDate.parse("2022-05-11"),"Bhumur Agrawal",12));
		hashmap.put("One Piece", new Book("One Piece",BookTypeEnum.valueOf("ROM"),125.5,LocalDate.parse("2012-06-12"),"Pratik Kulkarni",112));
		hashmap.put("Naruto", new Book("Naruto",BookTypeEnum.valueOf("FIC"),125.5,LocalDate.parse("2000-09-10"),"Jyotinjai Sharma",2));
		hashmap.put("Demon Slayers", new Book("Demon Slayers",BookTypeEnum.valueOf("ADV"),125.5,LocalDate.parse("1958-05-09"),"Anuj Joshi",55));
		hashmap.put("Jujutsu Kisan", new Book("Jujutsu Kisan",BookTypeEnum.valueOf("ACT"),125.5,LocalDate.parse("1998-12-22"),"Mukul Garg",15));
		hashmap.put("Death Note", new Book("Death Note",BookTypeEnum.valueOf("ROM"),125.5,LocalDate.parse("2008-11-28"),"Archit Aggrawal",66));
		hashmap.put("Motu Patlu", new Book("Motu Patlu",BookTypeEnum.valueOf("FIC"),125.5,LocalDate.parse("2002-05-31"),"Uday Vyash",19));
		hashmap.put("Chota Bheem", new Book("Chota Bheem",BookTypeEnum.valueOf("HOR"),125.5,LocalDate.parse("2024-06-30"),"Praful Kumar",2));
		return hashmap;
	}
	
	public static LinkedHashMap<String, Book> dataLinkedHashMap(){
		LinkedHashMap<String, Book> hashmap = new LinkedHashMap<>();
		hashmap.put("Tom and Jerry", new Book("Tom and Jerry",BookTypeEnum.valueOf("HOR"),125.5,LocalDate.parse("2022-05-11"),"Bhumur Agrawal",12));
		hashmap.put("One Piece", new Book("One Piece",BookTypeEnum.valueOf("ROM"),125.5,LocalDate.parse("2012-06-12"),"Pratik Kulkarni",112));
		hashmap.put("Naruto", new Book("Naruto",BookTypeEnum.valueOf("FIC"),125.5,LocalDate.parse("2000-09-10"),"Jyotinjai Sharma",2));
		hashmap.put("Demon Slayers", new Book("Demon Slayers",BookTypeEnum.valueOf("ADV"),125.5,LocalDate.parse("1958-05-09"),"Anuj Joshi",55));
		hashmap.put("Jujutsu Kisan", new Book("Jujutsu Kisan",BookTypeEnum.valueOf("ACT"),125.5,LocalDate.parse("1998-12-22"),"Mukul Garg",15));
		hashmap.put("Death Note", new Book("Death Note",BookTypeEnum.valueOf("ROM"),125.5,LocalDate.parse("2008-11-28"),"Archit Aggrawal",66));
		hashmap.put("Motu Patlu", new Book("Motu Patlu",BookTypeEnum.valueOf("FIC"),125.5,LocalDate.parse("2002-05-31"),"Uday Vyash",19));
		hashmap.put("Chota Bheem", new Book("Chota Bheem",BookTypeEnum.valueOf("HOR"),125.5,LocalDate.parse("2024-06-30"),"Praful Kumar",2));
		return hashmap;
	}
	
	public static TreeMap<String, Book> dataTreeMap(){
		TreeMap<String, Book> hashmap = new TreeMap<>();
		hashmap.put("Tom and Jerry", new Book("Tom and Jerry",BookTypeEnum.valueOf("HOR"),125.5,LocalDate.parse("2022-05-11"),"Bhumur Agrawal",12));
		hashmap.put("One Piece", new Book("One Piece",BookTypeEnum.valueOf("ROM"),125.5,LocalDate.parse("2012-06-12"),"Pratik Kulkarni",112));
		hashmap.put("Naruto", new Book("Naruto",BookTypeEnum.valueOf("FIC"),125.5,LocalDate.parse("2000-09-10"),"Jyotinjai Sharma",2));
		hashmap.put("Demon Slayers", new Book("Demon Slayers",BookTypeEnum.valueOf("ADV"),125.5,LocalDate.parse("1958-05-09"),"Anuj Joshi",55));
		hashmap.put("Jujutsu Kisan", new Book("Jujutsu Kisan",BookTypeEnum.valueOf("ACT"),125.5,LocalDate.parse("1998-12-22"),"Mukul Garg",15));
		hashmap.put("Death Note", new Book("Death Note",BookTypeEnum.valueOf("ROM"),125.5,LocalDate.parse("2008-11-28"),"Archit Aggrawal",66));
		hashmap.put("Motu Patlu", new Book("Motu Patlu",BookTypeEnum.valueOf("FIC"),125.5,LocalDate.parse("2002-05-31"),"Uday Vyash",19));
		hashmap.put("Chota Bheem", new Book("Chota Bheem",BookTypeEnum.valueOf("HOR"),125.5,LocalDate.parse("2024-06-30"),"Praful Kumar",2));
		return hashmap;
	}
	
	public static Map<StudentKey,Student> datastudentMap(){
		Map<StudentKey,Student> map = new HashMap<>();
		StudentKey sk1 = new StudentKey(12,"A",1);
		StudentKey sk2 = new StudentKey(11,"B",15);
		StudentKey sk3 = new StudentKey(10,"C",25);
		StudentKey sk4 = new StudentKey(1,"A",1);
		StudentKey sk5 = new StudentKey(6,"C",16);
		StudentKey sk6 = new StudentKey(7,"B",30);
		StudentKey sk7 = new StudentKey(9,"A",8);
		map.put(sk1, new Student(sk1,"Bhumur Agrawal"));
		map.put(sk2, new Student(sk2,"Bhumur Agrawal"));
		map.put(sk3, new Student(sk3,"Bhumur Agrawal"));
		map.put(sk4, new Student(sk4,"Bhumur Agrawal"));
		map.put(sk5, new Student(sk5,"Bhumur Agrawal"));
		map.put(sk6, new Student(sk6,"Bhumur Agrawal"));
		map.put(sk7, new Student(sk7,"Bhumur Agrawal"));
		return map;
	}
	
	public static TreeMap<StudentKey,Student> datastudentTreeMap(){
		TreeMap<StudentKey,Student> map = new TreeMap<>();
		StudentKey sk1 = new StudentKey(12,"A",1);
		StudentKey sk2 = new StudentKey(11,"B",15);
		StudentKey sk3 = new StudentKey(10,"C",25);
		StudentKey sk4 = new StudentKey(1,"A",1);
		StudentKey sk5 = new StudentKey(6,"C",16);
		StudentKey sk6 = new StudentKey(7,"B",30);
		StudentKey sk7 = new StudentKey(9,"A",8);
		map.put(sk1, new Student(sk1,"Bhumur Agrawal"));
		map.put(sk2, new Student(sk2,"Bhumur Agrawal"));
		map.put(sk3, new Student(sk3,"Bhumur Agrawal"));
		map.put(sk4, new Student(sk4,"Bhumur Agrawal"));
		map.put(sk5, new Student(sk5,"Bhumur Agrawal"));
		map.put(sk6, new Student(sk6,"Bhumur Agrawal"));
		map.put(sk7, new Student(sk7,"Bhumur Agrawal"));
		return map;
	}
}
