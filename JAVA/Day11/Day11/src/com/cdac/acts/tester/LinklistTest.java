package com.cdac.acts.tester;

import java.util.LinkedList;
import java.util.List;

import com.cdac.acts.util.DataEntry;

public class LinklistTest {

	public static void main(String[] args) {
		List<Integer> linkList = new LinkedList<Integer>();
		for(int i=0;i<10;i++) {
			linkList.add(DataEntry.genInteger());
		}
		
		System.out.println("With toString() LinkList : " + linkList);
		
		
		System.out.print("With Normal For loop and get() method : ");
		for(int i=0;i<linkList.size();i++) {
			System.out.print(linkList.get(i) + " ");
		}
		
		System.out.print("Use set method to store square : ");
		for(int i=0;i<linkList.size();i++) {
			linkList.set(i,linkList.get(i)*linkList.get(i));
		}
		
		System.out.print("ForEach loop : ");
		linkList.forEach(System.out::println);
		
		for(int i=0;i<linkList.size();i++)
		{
			if(linkList.get(i)>1000) {
				linkList.remove(i);
				i--;
			}
		}
		
		System.out.println("With toString() LinkList : " + linkList);
		
	}

}
