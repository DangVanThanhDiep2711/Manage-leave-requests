package database;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

import javax.swing.JOptionPane;

public class ConnectDB {
	private static Connection con = null;
	
//	Trả về chuỗi
	public static String getConnect() {
		String str = null;
		
		try (
			FileInputStream file = new FileInputStream("dateBase.properties");
		){
			var properties = new Properties();
			properties.load(file);
			str = properties.getProperty("url");
			str = str +  properties.getProperty("serverName");
			str = str + ":" +  properties.getProperty("portNumber");
			str = str + "; databasename=" +  properties.getProperty("databaseName");
			str = str + "; user=" +  properties.getProperty("user");
			str = str + "; password=" +  properties.getProperty("password");
			str = str + "; encrypt=" +  properties.getProperty("encrypt");
			str = str + "; trustServerCertificate=" +  properties.getProperty("trustServerCertificate");
//			JOptionPane.showMessageDialog(null, str);
			
//			var p = new Properties();
//			p.load(file);
//			str = p.getProperty("url");
//			str = str + p.getProperty("serverName");
//			str = str + ":" + p.getProperty("portNumber");
//			str = str + "; databasename=" + p.getProperty("databaseName");
//			str = str + "; user=" + p.getProperty("user");
//			str = str + "; password=" + p.getProperty("password");
//			str = str + "; encrypt=" + p.getProperty("encrypt");
//			str = str + "; trustServerCertificate=" 
//								+ p.getProperty("trustServerCertificate");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			str = null;
//			JOptionPane.showMessageDialog(null, e.getMessage());
		}
				
		return str;
	}
	
	
//	Trả về connection
	public static Connection connect() {
		
		try {
			con = DriverManager.getConnection(getConnect());
		} catch (Exception e) {
			e.printStackTrace();
			con = null;
		}
		return con;
	}
}
