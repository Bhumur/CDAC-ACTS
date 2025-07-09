package com.cdac.acts.tester;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Day16Test2 {

	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter The file Path : ");
			String filePath = sc.next();
			
		
			File file = new File(filePath);
			if(!file.isFile()) {
				file.createNewFile();
				System.out.println("File Created");
			}
			else {
				System.out.println("File Already Exsist");
			}
			
		}

	}

}
