package org.casper.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Service
@AllArgsConstructor
public class FortuneService {

	
	private DataSource ds;
	
	
	

	public String getResult() {
		String result = null;
		
		try(Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select now()");
			ResultSet rs = pstmt.executeQuery();
				){
			
			rs.next();
			
			result = rs.getString(1);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}


