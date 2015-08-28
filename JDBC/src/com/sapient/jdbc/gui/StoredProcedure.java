package com.sapient.jdbc.gui;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProcedure {

	public static void main(String[] args) {
		try {
			CallableStatement cStatement = null;
			Connection dbConnect = null;

			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			dbConnect = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "Danielle", "Danielle");
				
			cStatement = dbConnect.prepareCall("{call query_emp(?,?,?,?)}");
			
			int empID = 102;
			cStatement.setInt(1, empID);
			
			cStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
			cStatement.registerOutParameter(3, java.sql.Types.DECIMAL);
			cStatement.registerOutParameter(4, java.sql.Types.DECIMAL);
			
			cStatement.execute();
			
			String empName = cStatement.getString(2);
			BigDecimal empSal = cStatement.getBigDecimal(3);
			BigDecimal empComm = cStatement.getBigDecimal(4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
