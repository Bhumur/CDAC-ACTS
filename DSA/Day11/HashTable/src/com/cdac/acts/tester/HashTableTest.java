package com.cdac.acts.tester;

import com.cdac.acts.dataStructure.hashTable.HashTable;

public class HashTableTest {

	public static void main(String[] args) {
		HashTable hashTable = new HashTable(10);
		
		for(int i=0;i<100;i++) {
			hashTable.insert(i);
		}
		
		System.out.println("12 is present : " + hashTable.search(12));
		System.out.println("122 is present : " + hashTable.search(122));
		System.out.println("1222 is present : " + hashTable.search(1222));
		System.out.println("77 is present : " + hashTable.search(77));
		System.out.println("999 is present : " + hashTable.search(999));
		System.out.println("0 is present : " + hashTable.search(0));
		System.out.println("1000 is present : " + hashTable.search(1000));
		
		hashTable.print();
	}

}
