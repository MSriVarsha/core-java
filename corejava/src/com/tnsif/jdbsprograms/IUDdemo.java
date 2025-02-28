package com.tnsif.jdbsprograms;
// insert , update , delete demo

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IUDdemo {
	
	public static void main(String[] args) throws SQLException {
		
		
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/teegala","postgres","root");
		
		Statement st=con.createStatement();
		
		// insert the data
		
//		String str="insert into student values(105,'shivu','cse')";
//		System.out.println("the sql statement "+str);
//		
//		int countno=st.executeUpdate(str);
//		
//		System.out.println(countno +" record inserted");
		
		// delete the data
		
		String sqldelete="delete from student where sid=105";
		System.out.println("the sql statement "+sqldelete);
		
		int countdelte=st.executeUpdate(sqldelete);
		System.out.println(countdelte +" record deleted");
		
		
	}

}
