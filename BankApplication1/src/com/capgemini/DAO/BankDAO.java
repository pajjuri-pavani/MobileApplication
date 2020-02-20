package com.capgemini.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.Period;

import com.capgemini.Bean.BankBean;
import com.capgemini.DB.BankDB;


public class BankDAO 
{
	
/*public static void calculatePeriod(LocalDate startDate,LocalDate endDate) 
{ 
//Period period = Period.between(startDate, endDate); 
System.out.println("all transaction date between start and end "
           + "date is : " ); 
}

public void addFectch1(BankBean bankBean) {
	// TODO Auto-generated method stub
	
} 


}*/
	public int addBank(BankBean bankBean)
	{
		Connection con=null;
		PreparedStatement pst=null;
		try
		{
			con=BankDB.getConnection();
			pst=con.prepareStatement("insert into capgemini values(?,?,?)");
			pst.setInt(1,bankBean.getAccountId());
			pst.setString(2,bankBean.getStartDate());
			pst.setString(3, bankBean.getEndDate());
			
			
			int updateCount=pst.executeUpdate();
			return updateCount;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
		
	}

}
 