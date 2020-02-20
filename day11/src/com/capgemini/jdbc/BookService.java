package com.capgemini.jdbc;
import com.capgemini.jdbc.BookDAO;
import com.capgemini.jdbc.BookBean;

public class BookService {
	public int addBook(int bookId,String title,float price)
	{
		String grade="";
		if(price<300)
		{
			grade="C";
		}
		else if(price<=600)
		{
			grade="B";
		}
		else
		{
			grade="A";
		}
		BookDAO bookDAO=new BookDAO();
		BookBean bookBean=new BookBean();
		bookBean.setBookId(bookId);
		bookBean.setTitle(title);
		bookBean.setPrice(price);
		bookBean.setGrade(grade);
		
		int updateResult=0;
		try
		{
		updateResult=bookDAO.addBook1(bookBean);
		return updateResult;
		}
		catch(Exception e)
		{
		System.out.println("exception resolved");
		}
		return 0;
	}
}




