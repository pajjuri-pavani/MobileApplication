package com.capgemini.jdbc;

import java.util.Scanner;

import com.capgemini.jdbc.BookService;

public class BookUI {
public static void main(String[] args) {
	int bookId=0;
	String title="";
	float price=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the bookId");
	bookId=s.nextInt();
	System.out.println("enter title of book");
	title=s.next();
	s.nextLine();
	System.out.println("enter the price of book");
	price=s.nextFloat();
	s.nextLine();
	BookService bookService=new BookService();
	int updateCount=bookService.addBook(bookId,title,price);
	System.out.println(updateCount);
}
}



