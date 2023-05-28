package com.web_mini_proj.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
	public boolean verifyCrendentials(String email,String password);
	public void saveRegistration(String name,String city,String email,String mobile);
	public ResultSet ListAll();
	public void deleteReg(String email);
	public void updateRegistration(String email, String mobile);
	

}
