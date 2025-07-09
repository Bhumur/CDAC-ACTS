package com.cdac.acts.dataStructure.hashTable;

import com.cdac.acts.dataStructure.linkedList.LinkedList;

public class HashTable {
	LinkedList []hashTable;
	
	public HashTable(int size) {
		hashTable = new LinkedList[size];
	}
	
	public int hashFunction(int ele) {
		return ele % hashTable.length;
	}
	
	public void insert(int ele) {
		if(hashTable[hashFunction(ele)]==null) {
			hashTable[hashFunction(ele)] = new LinkedList();
		}
		hashTable[hashFunction(ele)].addAtFront(ele);
	}
	public boolean search(int ele) {
		return hashTable[hashFunction(ele)].search(ele);
	}
	public void print() {
		for(int i=0;i<hashTable.length;i++) {
			hashTable[i].print();
		}
	}
}
