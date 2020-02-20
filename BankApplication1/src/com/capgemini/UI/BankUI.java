package com.capgemini.UI;

import java.time.LocalDate;
import java.util.Scanner;

import com.capgemini.DAO.BankDAO;
import com.capgemini.Service.BankService;


public class BankUI 
{
	public static void main(String[] args) {
			int AccountId;
			String StartDate;
			String endDate;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the accountId");
			 AccountId=s.nextInt();
			System.out.println("enter the satrt date");
			String SatrtDate = s.next();
			s.nextLine();
			System.out.println("enter the end date");
			String EndDate=s.next();
			s.nextLine();
			BankService bankService=new BankService();
			
		}
	

	}

