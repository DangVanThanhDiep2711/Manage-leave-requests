package Dao;

import java.util.ArrayList;
import java.util.List;

import database.ConnectDB;
import entity.Employees;

public class CRUD {
	public List<Employees> getList() {
		List<Employees> list = new ArrayList<>(); 
		try (
				var con = ConnectDB.connect();
				var cs = con.prepareCall("{call selectEmployees}");
				var result = cs.executeQuery();
		){
			while (result.next()) {
				var emp = new Employees();
				emp.setEmployeeID(result.getInt("EmployeeID"));
				emp.setName(result.getString("Name"));
				emp.setEmail(result.getString("Email"));
				emp.setPassword(result.getString("Password"));
				emp.setRole(result.getString("Role"));
				list.add(emp);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}