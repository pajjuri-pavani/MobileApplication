package com.capgemini.Service;

import java.time.LocalDate;

import com.capgemini.Bean.BankBean;
import com.capgemini.DAO.BankDAO;


public class BankService 
{
	public void addbank(int AccountId,String StartDate,String EndDate)
	{
		BankDAO bankDAO=new BankDAO();
		BankBean bankBean=new BankBean();
		bankBean.setAccountId(AccountId);
		bankBean.setStartDate(StartDate);
		bankBean.setEndDate(EndDate);	
		
	}

	public static int addbank() {
		// TODO Auto-generated method stub
		return 0;
	}
}




